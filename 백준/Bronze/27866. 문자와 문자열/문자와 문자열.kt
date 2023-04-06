import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    bw.write("${input[br.readLine().toInt() - 1]}")

    br.close()
    bw.close()
}