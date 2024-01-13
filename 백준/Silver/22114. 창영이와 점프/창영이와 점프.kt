import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val distance = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n) { Array(2){0} }
    var result = 0
    dp[0][0] = 1
    dp[0][1] = 1

    for (i in 1 until n) {
        if (distance[i] <= k) {
            dp[i][0] = dp[i - 1][0] + 1
            dp[i][1] = dp[i - 1][1] + 1
        } else {
            dp[i][0] = 1
            dp[i][1] = max(1, dp[i - 1][0] + 1)
        }

        result = max(result, max(dp[i][0], dp[i][1]))
    }
    bw.write("$result")

    bw.close()
    br.close()
}