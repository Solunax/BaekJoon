import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(50001){0}
    val div = 1000000009

    dp[1] = 1
    dp[2] = 1
    dp[3] = 2

    for (i in 4 .. n) {
        dp[i] = (dp[i - 1] + dp[i - 3]) % div
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}