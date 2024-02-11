import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (h, n) = br.readLine().split(" ").map { it.toInt() }

    if (h == n) {
        bw.write("1")
    } else {
        if (h > n) {
            h = n.also { n = h }
        }

        val dp = Array(31) { Array(31) { 0L } }

        dp[h].fill(1)

        for (i in h + 1..n) {
            for (j in h + 1..n) {
                if (i <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
                }
            }
        }
        
        bw.write("${dp[n][n]}")
    }

    bw.close()
    br.close()
}