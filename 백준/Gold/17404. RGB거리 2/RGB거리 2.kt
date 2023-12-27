import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val cost = Array(n + 1) { List(3) { 0 } }
    val dp = Array(n + 1) { Array(3) { 0 } }
    var result = Int.MAX_VALUE

    repeat(n) {
        cost[it + 1] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    repeat(3) { c ->
        repeat(3) {
            if (c == it) {
                dp[1][it] = cost[1][c]
            } else {
                dp[1][it] = 10000000
            }
        }

        for (i in 2..n) {
            dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]
            dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]
            dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]
        }

        repeat(3) {
            if (c != it) {
                result = min(result, dp[n][it])
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}