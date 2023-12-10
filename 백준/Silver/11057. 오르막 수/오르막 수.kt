import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { Array(10) { 0 } }

    repeat(10) {
        dp[1][it] = 1
    }

    for (i in 2..n) {
        for (j in 0..9) {
            for (k in 0..j) {
                dp[i][j] += dp[i - 1][k]
                dp[i][j] = dp[i][j] % 10007
            }
        }
    }

    var result = 0L
    repeat(10) {
        result += dp[n][it]
    }

    bw.write("${result % 10007}")

    bw.close()
    br.close()
}