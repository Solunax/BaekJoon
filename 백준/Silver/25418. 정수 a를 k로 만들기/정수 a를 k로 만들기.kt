import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(k + 1){0}
    dp[n] = 0
    for (i in n + 1 .. k) {
        if (i / 2 >= n && i % 2 == 0) {
            dp[i] = min(dp[i - 1], dp[i / 2]) + 1
        } else {
            dp[i]  = dp[i - 1] + 1
        }
    }
    bw.write("${dp[k]}")

    bw.close()
    br.close()
}