import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(10) { 0 }
    dp[2] = 2

    for (i in 3..n) {
        dp[i] = dp[i - 1] * 3
    }

    bw.write("${dp[n]}")

    bw.close()
    br.close()
}