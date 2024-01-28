import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n){0}
    var maxValue = 0

    for (i in 0 until n) {
        dp[i] = arr[i]

        for (j in 0 until i) {
            if (arr[i] < arr[j]) {
                dp[i] = max(dp[i], dp[j] + arr[i])
            }
        }
        maxValue = max(maxValue, dp[i])
    }
    bw.write("$maxValue")

    bw.close()
    br.close()
}