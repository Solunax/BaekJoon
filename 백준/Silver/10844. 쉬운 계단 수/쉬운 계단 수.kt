import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { Array(10) { 0L } }

    for (i in 1.. 9) {
        dp[1][i] = 1
    }


    for (i in 2 .. n) {
        for (j in 0 .. 9) {
            when (j) {
                0 -> dp[i][0] = dp[i - 1][1]
                9 -> dp[i][9] = dp[i - 1][8]
                else -> dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1]
            }
            dp[i][j] = dp[i][j] % 1000000000
        }
    }

    var result = 0L
    for (i in 0 .. 9) {
        result += dp[n][i]
    }
    
    bw.write("${result % 1000000000}")

    bw.close()
    br.close()
}