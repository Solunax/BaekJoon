import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(16){ Array(16){1} }

    for (i in 1 ..n){
        for (j in 1 .. n) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
        }
    }

    bw.write("${dp[n][n]} ${n * n}")

    bw.close()
    br.close()
}