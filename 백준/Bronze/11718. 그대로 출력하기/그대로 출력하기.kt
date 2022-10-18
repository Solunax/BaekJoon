import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while(true){
        val input = br.readLine()
        if(input.isNullOrBlank())
            break
        else
            bw.write("$input\n")
    }

    bw.close()
    br.close()
}