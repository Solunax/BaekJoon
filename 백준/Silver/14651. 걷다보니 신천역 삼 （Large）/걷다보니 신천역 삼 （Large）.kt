import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val divide = 1000000009
    val dp = Array(33334) { 0L }
    dp[2] = 2

    for (i in 3..n) {
        dp[i] = (dp[i - 1] * 3) % divide
    }

    bw.write("${dp[n]}")

    bw.close()
    br.close()
}