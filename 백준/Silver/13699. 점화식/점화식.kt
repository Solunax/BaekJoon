import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(36) { 0L }
    dp[0] = 1
    dp[1] = 1

    for (i in 2 .. 35) {
        for (j in 0 until i) {
            dp[i] += dp[j] * dp[i - 1 - j]
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}