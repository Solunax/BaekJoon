import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { List(m) { 0 } }
    val dp = Array(n) { Array(m) { Array(3) { 0 } } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (i in 0 until m) {
        repeat(3) {
            dp[0][i][it] = map[0][i]
        }
    }

    for (i in 1 until n) {
        for (j in 0 until m) {
            if (j - 1 >= 0 && j + 1 < m) {
                dp[i][j][0] = map[i][j] + min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][2])
                dp[i][j][1] = map[i][j] + min(dp[i - 1][j][0], dp[i - 1][j][2])
                dp[i][j][2] = map[i][j] + min(dp[i - 1][j + 1][0], dp[i - 1][j + 1][1])
            } else if (j + 1 < m) {
                dp[i][j][0] = 987654321
                dp[i][j][1] = map[i][j] + min(dp[i - 1][j][0], dp[i - 1][j][2])
                dp[i][j][2] = map[i][j] + min(dp[i - 1][j + 1][0], dp[i - 1][j + 1][1])
            } else {
                dp[i][j][0] = map[i][j] + min(dp[i - 1][j - 1][1], dp[i - 1][j - 1][2])
                dp[i][j][1] = map[i][j] + min(dp[i - 1][j][0], dp[i - 1][j][2])
                dp[i][j][2] = 987654321
            }
        }
    }

    var result = dp[n - 1][0][0]

    for (i in 0 until m) {
        repeat(3) {
            result = min(result, dp[n - 1][i][it])
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}