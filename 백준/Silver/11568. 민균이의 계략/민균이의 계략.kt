import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val num = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1){1}
    var maxValue = 0

    for (i in 1 .. n) {
        for (j in 1 until i) {
            if (num[i] > num[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        maxValue = max(dp[i], maxValue)
    }
    bw.write("$maxValue")

    bw.close()
    br.close()
}