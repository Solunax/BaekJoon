import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1){ Array(m + 1){0L} }
    dp[0][0] = 1

    for (i in 1 .. n) {
        for (j in 1 .. m) {
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1] + dp[i - 1][j - 1]) % 1000000007
        }
    }
    bw.write("${dp[n][m] % 1000000007}")

    bw.close()
    br.close()
}