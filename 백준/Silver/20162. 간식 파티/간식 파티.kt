import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n + 1) { 0 }
    val dp = Array(1001) { 0 }
    var maxScore = 0

    repeat(n) {
        arr[it + 1] = br.readLine().toInt()
    }

    for (i in 1..n) {
        dp[i] = arr[i]
        for (j in 1 until n) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + arr[i])
            }
        }
        maxScore = max(maxScore, dp[i])
    }
    bw.write("$maxScore")

    bw.close()
    br.close()
}