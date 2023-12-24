import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val maxValue = Int.MAX_VALUE.toLong()
    val arr = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { maxValue }
    dp[1] = 0

    for (i in 1..n) {
        if (dp[i] >= maxValue)
            continue

        for (j in 1..arr[i]) {
            if (i + j <= n) {
                dp[i + j] = min(dp[i + j], dp[i] + 1)
            }
        }
    }

    if (dp[n] >= maxValue) {
        bw.write("-1")
    } else {
        bw.write("${dp[n]}")
    }

    bw.close()
    br.close()
}