import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(301) { Array(301) { 0L } }
    val dp = Array(301) { Array(301) { 0L } }

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        map[x][y] = m.toLong()
    }

    for (i in 0..300) {
        for (j in 0..300) {
            val v1 = if (i > 0) {
                dp[i - 1][j]
            } else {
                0
            }

            val v2 = if (j > 0) {
                dp[i][j - 1]
            } else {
                0
            }

            dp[i][j] = max(v1, v2)

            if (map[i][j] > 0) {
                dp[i][j] = dp[i][j] + max(m - i - j, 0)
            }
        }
    }
    bw.write("${dp[300][300]}")

    bw.close()
    br.close()
}