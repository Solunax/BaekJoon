import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var case = 1
    while (true) {
        val n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        val dp = Array(n) { Array(3) { 0L } }

        repeat(n) {
            dp[it] = br.readLine().split(" ").map { v -> v.toLong() }.toTypedArray()
        }

        for (i in 1 until n) {
            if (i == 1) {
                for (j in 0 until 3) {
                    dp[i][j] += when (j) {
                        0 -> dp[0][1]
                        else -> min(dp[i][j - 1], min(dp[0][1], dp[0][1] + dp[0][2]))
                    }
                }
            } else {
                dp[i][0] += min(dp[i - 1][0], dp[i - 1][1])
                dp[i][1] += min(min(dp[i][0], dp[i - 1][0]), min(dp[i - 1][1], dp[i - 1][2]))
                dp[i][2] += min(dp[i][1], min(dp[i - 1][1], dp[i - 1][2]))
            }
        }

        bw.write("${case++}. ${dp[n - 1][1]}\n")
    }

    bw.close()
    br.close()
}