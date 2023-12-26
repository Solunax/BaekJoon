import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, w) = br.readLine().split(" ").map { it.toInt() }
    val tree = Array(n + 1) { 0 }
    val dp = Array(n + 1) { Array(w + 1) { Array(3) { 0 } } }

    repeat(n) {
        tree[it + 1] = br.readLine().toInt()
    }

    if (tree[1] == 1) {
        dp[1][0][1] = 1
        dp[1][1][2] = 0
    } else {
        dp[1][0][1] = 0
        dp[1][1][2] = 1
    }

    for (t in 2..n) {
        if (tree[t] == 1) {
            dp[t][0][1] = dp[t - 1][0][1] + 1
            dp[t][0][2] = dp[t - 1][0][2]

            for (m in 1 .. w) {
                dp[t][m][1] = max(dp[t - 1][m][1], dp[t - 1][m - 1][2]) + 1
                dp[t][m][2] = max(dp[t - 1][m - 1][1], dp[t - 1][m][2])
            }
        } else {
            dp[t][0][1] = dp[t - 1][0][1]
            dp[t][0][2] = dp[t - 1][0][2] + 1

            for (m in 1 .. w) {
                dp[t][m][1] = max(dp[t - 1][m][1], dp[t - 1][m - 1][2])
                dp[t][m][2] = max(dp[t - 1][m - 1][1], dp[t - 1][m][2]) + 1
            }
        }
    }

    var result = 0
    for (i in 0 .. w) {
        result = max(result, max(dp[n][i][1], dp[n][i][2]))
    }
    bw.write("$result")

    bw.close()
    br.close()
}