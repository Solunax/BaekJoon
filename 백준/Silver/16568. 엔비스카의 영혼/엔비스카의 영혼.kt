import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, a, b) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(1000001){0}

    for (i in 1 .. n) {
        dp[i] = dp[i - 1] + 1

        if (i - a - 1 >= 0) {
            dp[i] = min(dp[i], dp[i - a - 1] + 1)
        }

        if (i - b - 1 >= 0) {
            dp[i] = min(dp[i], dp[i - b - 1] + 1)
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}