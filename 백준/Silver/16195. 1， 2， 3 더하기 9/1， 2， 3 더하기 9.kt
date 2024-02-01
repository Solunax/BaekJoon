import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1001) { Array(1001) { 0L } }
    val div = 1000000009

    dp[1][1] = 1
    dp[2][1] = 1
    dp[2][2] = 1
    dp[3][1] = 1
    dp[3][2] = 2
    dp[3][3] = 1

    for (i in 4..1000) {
        for (j in 2..1000) {
            dp[i][j] = (dp[i - 1][j - 1] + dp[i - 2][j - 1] + dp[i - 3][j - 1]) % div
        }
    }

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var sum = 0L
        for (i in 1..m) {
            sum = (sum + dp[n][i]) % div
        }
        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}