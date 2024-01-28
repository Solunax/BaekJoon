import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(10001){1L}
    val div = 1000000007

    dp[m] = 2
    for (i in m + 1 .. n) {
        dp[i] = (dp[i - 1] + dp[i - m]) % div
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}