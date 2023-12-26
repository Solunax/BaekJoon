import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { 0 }
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = i

        for (j in 1..sqrt(i.toDouble()).toInt()) {
            dp[i] = min(dp[i], dp[i - j * j] + 1)
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}