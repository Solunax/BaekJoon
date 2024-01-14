import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(100001) {0}
    dp[1] = 1
    dp[2] = 1
    dp[3] = 2
    dp[4] = 2
    dp[5] = 1
    dp[6] = 2
    dp[7] = 1

    for (i in 8 .. n) {
        dp[i] = min(dp[i - 1], min(dp[i - 2], min(dp[i - 5], dp[i - 7]))) + 1
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}