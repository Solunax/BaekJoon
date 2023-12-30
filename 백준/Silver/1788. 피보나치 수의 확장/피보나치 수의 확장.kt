import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt() + 1000000
    val dp = Array(2000001) { 0L }
    dp[1000001] = 1

    if (n < 1000000) {
        for (i in 999999 downTo n) {
            dp[i] = (dp[i + 2] - dp[i + 1]) % 1000000000
        }
    } else {
        for (i in 1000002 .. n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000
        }
    }

    if (dp[n] > 0) {
        bw.write("1\n")
    } else if (dp[n] < 0) {
        bw.write("-1\n")
    } else {
        bw.write("0\n")
    }
    bw.write("${abs(dp[n]) }")

    bw.close()
    br.close()
}