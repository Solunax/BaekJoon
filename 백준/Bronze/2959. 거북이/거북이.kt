import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, b, _, d) = br.readLine().split(" ").map { it.toInt() }.sortedDescending()

    bw.write("${b * d}")

    bw.close()
    br.close()
}