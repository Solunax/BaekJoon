import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val number = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n){ Array(21){0L} }

    dp[0][number[0]] = 1
    for (i in 1 until n - 1) {
        for (j in 0 .. 20) {
            if (j + number[i] <= 20) {
                dp[i][j] += dp[i - 1][j + number[i]]
            }

            if (j - number[i] >= 0) {
                dp[i][j] += dp[i - 1][j - number[i]]
            }
        }
    }
    bw.write("${dp[n - 2][number[n - 1]]}")

    bw.close()
    br.close()
}