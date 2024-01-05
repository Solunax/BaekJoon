import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(8){0L}
    dp[0] = 1

    repeat(n) {
        val temp = Array(8){0L}

        temp[0] = dp[1] + dp[3]
        temp[1] = dp[0] + dp[2] + dp[3]
        temp[2] = dp[1] + dp[3] + dp[4] + dp[5]
        temp[3] = dp[0] + dp[1] + dp[2] + dp[5]
        temp[4] = dp[2] + dp[5] + dp[6]
        temp[5] = dp[2] + dp[3] + dp[4] + dp[7]
        temp[6] = dp[4] + dp[7]
        temp[7] = dp[5] + dp[6]

        repeat(8) {
            dp[it] = temp[it] % 1000000007
        }
    }
    bw.write("${dp[0]}")

    bw.close()
    br.close()
}