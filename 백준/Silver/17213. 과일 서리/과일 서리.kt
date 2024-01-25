import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val dp = Array(11) { Array(31){0} }
    dp[1].fill(1)

    for (i in 2 .. n) {
        for (j in i .. m) {
            dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1]
        }
    }

    bw.write("${dp[n][m]}")

    bw.close()
    br.close()
}