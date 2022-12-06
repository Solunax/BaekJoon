import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val origin: String = br.readLine()
fun main() {
    val result = br.readLine()

    if(find(result))
        bw.write("1")
    else
        bw.write("0")

    br.close()
    bw.close()
}

fun find(str : String) : Boolean{
    if(origin.length == str.length){
        return origin == str
    }

    if(str.last() == 'A'){
        if(find(str.substring(0, str.length-1)))
            return true
    }

    if(str.first() == 'B'){
        if(find(str.substring(1, str.length).reversed()))
            return true
    }

    return false
}