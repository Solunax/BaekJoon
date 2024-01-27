import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h) = br.readLine().split(" ").map { it.toInt() }
    val (tx, ty) = br.readLine().split(" ").map { it.toInt() }
    val div = 1000007
    val dp = Array(h) { Array(w) { 1L } }

    for (i in 1 until h) {
        for (j in 1 until w) {
            dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % div
        }
    }

    bw.write("${(dp[ty - 1][tx - 1] * dp[h - ty][w - tx]) % 1000007}")

    bw.close()
    br.close()
}