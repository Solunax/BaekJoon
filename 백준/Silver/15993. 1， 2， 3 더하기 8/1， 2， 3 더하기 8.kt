import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(100001) { Array(2) { 0L } }
    val div = 1000000009
    dp[1][0] = 0
    dp[1][1] = 1
    dp[2][0] = 1
    dp[2][1] = 1
    dp[3][0] = 2
    dp[3][1] = 2

    for (i in 4..100000) {
        dp[i][0] = (dp[i - 1][1] + dp[i - 2][1] + dp[i - 3][1]) % div
        dp[i][1] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 3][0]) % div
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        bw.write("${dp[n][1]} ${dp[n][0]}\n")
    }

    bw.close()
    br.close()
}