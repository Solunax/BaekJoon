import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1001) { Array(10) { 0 } }
    val div = 1234567
    dp[1].fill(1)

    for (i in 2..1000) {
        dp[i][0] = dp[i - 1][7] % div
        dp[i][1] = (dp[i - 1][2] + dp[i - 1][4]) % div
        dp[i][2] = (dp[i - 1][1] + dp[i - 1][3] + dp[i - 1][5]) % div
        dp[i][3] = (dp[i - 1][2] + dp[i - 1][6]) % div
        dp[i][4] = (dp[i - 1][1] + dp[i - 1][5] + dp[i - 1][7]) % div
        dp[i][5] = (dp[i - 1][2] + dp[i - 1][4] + dp[i - 1][6] + dp[i - 1][8]) % div
        dp[i][6] = (dp[i - 1][3] + dp[i - 1][5] + dp[i - 1][9]) % div
        dp[i][7] = (dp[i - 1][4] + dp[i - 1][8] + dp[i - 1][0]) % div
        dp[i][8] = (dp[i - 1][5] + dp[i - 1][7] + dp[i - 1][9]) % div
        dp[i][9] = (dp[i - 1][6] + dp[i - 1][8]) % div
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var result = 0

        dp[n].forEach {
            result = (result + it) % div
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}