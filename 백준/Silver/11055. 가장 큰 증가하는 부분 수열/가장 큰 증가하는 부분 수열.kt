import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val number = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    val dp = number.clone()
    var result = 0

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (number[i] > number[j]) {
                dp[i] = max(dp[i], dp[j] + number[i])
            }
        }
        result = max(result, dp[i])
    }
    bw.write("$result")

    bw.close()
    br.close()
}