import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { List(m + 1) { 0 } }
    val dp = Array(n + 1) { Array(m + 1) { 0 } }

    for (i in 1..n) {
        map[i] = listOf(0) + br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }
    }

    var maxValue = 0
    for (i in 1..n) {
        for (j in 1..m) {
            if (map[i][j] == 1) {
                dp[i][j] = min(dp[i - 1][j], min(dp[i][j - 1], dp[i - 1][j - 1])) + 1
                maxValue = max(maxValue, dp[i][j])
            }
        }
    }
    bw.write("${maxValue * maxValue}")

    bw.close()
    br.close()
}