import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    bw.write("${input[0] + input[1]}")

    bw.close()
    br.close()
}