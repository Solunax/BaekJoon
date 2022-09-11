import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    while(true){
        val input = br.readLine()

        if(input == "***")
            break

        bw.write("${input.reversed()}\n")
    }

    bw.close()
    br.close()
}