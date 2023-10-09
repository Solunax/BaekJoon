import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine().split(" ")

        if(input[0] == "#")
            break

        input.forEach {
            bw.write("${it.reversed()} ")
        }
        
        bw.write("\n")
    }

    bw.close()
    br.close()
}