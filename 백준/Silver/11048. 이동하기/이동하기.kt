import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { Array(m + 1) { 0 } }
    val dp = Array(n + 1) { Array(m + 1) { 0 } }

    for (i in 1..n) {
        map[i] = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }
    
    dp[1][1] = map[1][1]

    for (i in 1..n) {
        for (j in 1..m) {
            val ni = i + 1
            val nj = j + 1

            if (ni in 1..n) {
                dp[ni][j] = max(dp[ni][j], dp[i][j] + map[ni][j])
            }

            if (nj in 1..m) {
                dp[i][nj] = max(dp[i][nj], dp[i][j] + map[i][nj])
            }

            if (ni in 1..n && nj in 1..m) {
                dp[ni][nj] = max(dp[ni][nj], dp[i][j] + map[ni][nj])
            }
        }
    }
    bw.write("${dp[n][m]}")

    bw.close()
    br.close()
}