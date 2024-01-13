import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { Array(m + 1) { 0 } }

    for (i in 1..n) {
        map[i] = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }
    }

    for (i in 1..n) {
        for (j in 1..m) {
            map[i][j] += max(map[i - 1][j], map[i][j - 1])
        }
    }
    bw.write("${map[n][m]}")

    bw.close()
    br.close()
}