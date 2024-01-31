import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (m, n) = br.readLine().split(" ").map { it.toInt() }
    val input = Array(2002) { Array(2002) { 0 } }
    val dp = Array(2002) { Array(2002) { 0 } }

    repeat(m) { i ->
        val value = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }

        for (j in 0 until n) {
            input[i + 1][j + 1] = value[j]
        }
    }

    for (i in 1..m) {
        dp[i][1] = input[i][1]
    }

    for (j in 2..n) {
        for (i in 1..m) {
            val maxValue = max(dp[i - 1][j - 1], max(dp[i][j - 1], dp[i + 1][j - 1]))
            dp[i][j] = maxValue + input[i][j]
        }
    }

    var result = 0
    for (i in 1 .. m) {
        result = max(result, dp[i][n - 1])
    }
    bw.write("$result")

    bw.close()
    br.close()
}