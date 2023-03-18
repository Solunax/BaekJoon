import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()
    bw.write("${check(str)}")


    br.close()
    bw.close()
}

fun check(str : String) : Boolean{
    if(str.length != 1) {
        if(str.length % 2 == 0){
            for(i in 0 until str.length / 2){
                if(str[i] != str[str.length - 1 - i])
                    return false
            }
        }else{
            for(i in 0 until (str.length - 1) / 2){
                if(str[i] != str[str.length - 1 - i])
                    return false
            }
        }
    }

    return true
}