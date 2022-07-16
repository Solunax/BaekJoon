import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val origin = br.readLine()
    var wants = br.readLine()
    
    while(origin.length != wants.length){
        if(wants.last() == 'A')
            wants = wants.substring(0, wants.lastIndex)
        else{
            wants = wants.substring(0, wants.lastIndex)
            wants = wants.reversed()
        }
    }

    if(origin == wants)
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}