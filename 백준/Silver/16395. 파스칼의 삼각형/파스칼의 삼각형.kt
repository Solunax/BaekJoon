import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(31){ Array(31){0} }
    dp[1][1] = 1
    dp[2][1] = 1
    dp[2][2] = 1

    for (i in 3 .. n) {
        for (j in 1 .. i) {
            if (j == 1 || j == i ) {
                dp[i][j] = 1
            } else {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
            }
        }
    }
    bw.write("${dp[n][k]}")

    bw.close()
    br.close()
}