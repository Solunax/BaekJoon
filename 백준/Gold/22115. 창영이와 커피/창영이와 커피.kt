import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val caffeine = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(k + 1) { 1000000000 }
    dp[0] = 0

    repeat(n) { idx ->
        for (i in k downTo caffeine[idx]) {
            dp[i] = min(dp[i], dp[i - caffeine[idx]] + 1)
        }
    }

    if (dp[k] >= 100000000) {
        bw.write("-1")
    } else {
        bw.write("${dp[k]}")
    }

    bw.close()
    br.close()
}