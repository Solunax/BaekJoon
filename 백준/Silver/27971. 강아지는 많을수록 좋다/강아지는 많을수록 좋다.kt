import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, a, b) = br.readLine().split(" ").map { it.toInt() }
    val block = Array(n + 1) { 0 }
    val dp = Array(n + 1) { Int.MAX_VALUE }
    dp[0] = 0

    repeat(m) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }

        for (i in start..end) {
            block[i] = -1
        }
    }

    for (i in 0..n) {
        if (block[i] < 0 || dp[i] == Int.MAX_VALUE) {
            continue
        }

        if (i + a <= n) {
            dp[i + a] = min(dp[i + a], dp[i] + 1)
        }

        if (i + b <= n) {
            dp[i + b] = min(dp[i + b], dp[i] + 1)
        }
    }

    if (dp[n] == Int.MAX_VALUE) {
        bw.write("-1")
    } else {
        bw.write("${dp[n]}")
    }

    bw.close()
    br.close()
}