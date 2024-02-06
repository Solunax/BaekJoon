import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val bridge = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { Long.MAX_VALUE }
    dp[1] = 0

    for (i in 2..n) {
        for (j in 1 until i) {
            var energy = (i - j).toLong() * (1 + abs(bridge[i] - bridge[j]))

            energy = max(energy, dp[j])
            dp[i] = min(dp[i], energy)
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}