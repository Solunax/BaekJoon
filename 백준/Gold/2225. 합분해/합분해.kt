import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(k + 1) { Array(n + 1) { 1 } }
    val div = 1000000000

    for (i in 2..k) {
        for (j in 1..n) {
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % div
        }
    }

    bw.write("${dp[k][n]}")

    bw.close()
    br.close()
}