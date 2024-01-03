import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n) { 0.0 }

    repeat(n) {
        dp[it] = br.readLine().toDouble()
    }

    var maxValue = 0.0

    for (i in 1 until n) {
        dp[i] = max(dp[i], dp[i - 1] * dp[i])
        maxValue = max(maxValue, dp[i])
    }
    bw.write("%.3f".format(maxValue))

    bw.close()
    br.close()
}