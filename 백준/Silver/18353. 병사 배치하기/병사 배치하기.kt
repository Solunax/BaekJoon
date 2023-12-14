import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val soldier = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 1 }
    var count = 0

    for (i in 1 .. n) {
        for (j in 1 until i) {
            if (soldier[j] > soldier[i]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        count = max(count, dp[i])
    }
    bw.write("${n - count}")

    bw.close()
    br.close()
}