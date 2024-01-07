import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(100001){Array(4){0L} }
    dp[1][1] = 1
    dp[2][2] = 1
    dp[3][1] = 1
    dp[3][2] = 1
    dp[3][3] = 1

    for (i in 4 .. 100000) {
        dp[i][1] = (dp[i - 1][2] + dp[i - 1][3]) % 1000000009
        dp[i][2] = (dp[i - 2][1] + dp[i - 2][3]) % 1000000009
        dp[i][3] = (dp[i - 3][1] + dp[i - 3][2]) % 1000000009
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        bw.write("${(dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009}\n")
    }

    bw.close()
    br.close()
}