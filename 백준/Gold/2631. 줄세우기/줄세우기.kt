import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val height = Array(n + 1){0}
    val dp = Array(n + 1){1}
    var maxValue = 0

    for (i in 1 .. n) {
        height[i] = br.readLine().toInt()
    }

    for (i in 1 .. n) {
        for (j in 1 until i) {
            if (height[i] > height[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        maxValue = max(dp[i], maxValue)
    }
    bw.write("${n - maxValue}")

    bw.close()
    br.close()
}