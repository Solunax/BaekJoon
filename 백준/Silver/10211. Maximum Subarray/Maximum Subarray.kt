import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val num = br.readLine().split(" ").map { it.toInt() }
        val dp = Array(n){0}
        var maxValue = num[0]
        dp[0] = num[0]

        for (i in 1 until n) {
            dp[i] = max(num[i], dp[i - 1] + num[i])
            maxValue = max(dp[i], maxValue)
        }
        bw.write("$maxValue\n")
    }

    bw.close()
    br.close()
}