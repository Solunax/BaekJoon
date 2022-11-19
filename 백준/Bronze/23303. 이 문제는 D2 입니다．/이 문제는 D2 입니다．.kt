import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    if(input.contains("d2") || input.contains("D2"))
        bw.write("D2")
    else
        bw.write("unrated")

    bw.close()
    br.close()
}