import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (h, y) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(y + 1){0}
    dp[0] = h

    for (i in 1 .. y) {
        dp[i] = (dp[i - 1] * 1.05).toInt()

        if (i >= 3) {
            dp[i] = max(dp[i], (dp[i - 3] * 1.2).toInt())
        }

        if (i >= 5) {
            dp[i] = max(dp[i], (dp[i - 5] * 1.35).toInt())
        }
    }
    bw.write("${dp[y]}")

    bw.close()
    br.close()
}