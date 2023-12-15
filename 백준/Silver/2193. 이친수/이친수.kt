import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1){0L}
    dp[1] = 1

    for (i in 2 .. n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}