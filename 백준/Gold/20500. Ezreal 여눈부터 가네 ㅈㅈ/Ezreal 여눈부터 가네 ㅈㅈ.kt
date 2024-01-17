import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(3) { Array(n + 1) { 0L } }

    if (n == 1) {
        bw.write("0")
    } else {
        dp[0][2] = 1
        dp[1][2] = 1

        for (i in 3..n) {
            dp[0][i] = (dp[1][i - 1] + dp[2][i - 1]) % 1000000007
            dp[1][i] = (dp[0][i - 1] + dp[2][i - 1]) % 1000000007
            dp[2][i] = (dp[0][i - 1] + dp[1][i - 1]) % 1000000007
        }

        bw.write("${dp[0][n]}")
    }

    bw.close()
    br.close()
}