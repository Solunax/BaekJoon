import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(51) { 0 }
    dp[0] = 1
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = (1 + dp[i - 1] + dp[i - 2]) % 1000000007
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}