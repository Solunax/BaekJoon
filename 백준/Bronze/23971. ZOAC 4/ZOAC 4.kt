import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (h, w, n, m) = br.readLine().split(" ").map { it.toInt() }
    val v1 = (h - 1) / (n + 1) + 1
    val v2 = (w - 1) / (m + 1) + 1

    bw.write("${v1 * v2}")

    bw.close()
    br.close()
}