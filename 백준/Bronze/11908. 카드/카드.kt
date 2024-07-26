import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine().split(" ").map { it.toInt() }.sorted()
    bw.write("${input.sum() - input.last()}")

    bw.close()
    br.close()
}