import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { Array(3) { Array(2) { 0 } } }
    val div = 1000000

    dp[1][0][0] = 1
    dp[1][1][0] = 1
    dp[1][0][1] = 1

    for (i in 2..n) {
        dp[i][0][0] = (dp[i - 1][0][0] + dp[i - 1][1][0] + dp[i - 1][2][0]) % div
        dp[i][0][1] = (dp[i - 1][0][0] + dp[i - 1][1][0] + dp[i - 1][0][1]
                + dp[i - 1][1][1] + dp[i - 1][2][0] + dp[i - 1][2][1]) % div
        dp[i][1][0] = dp[i - 1][0][0] % div
        dp[i][1][1] = dp[i - 1][0][1] % div
        dp[i][2][0] = dp[i - 1][1][0] % div
        dp[i][2][1] = dp[i - 1][1][1] % div
    }

    val result = (dp[n][0][0] + dp[n][0][1] + dp[n][1][0]
            + dp[n][1][1] + dp[n][2][0] + dp[n][2][1]) % div
    bw.write("$result")

    bw.close()
    br.close()
}