import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val coin = Array(n) { 0 }
    val dp = Array(k + 1) { 100001 }
    dp[0] = 0

    repeat(n) {
        coin[it] = br.readLine().toInt()
    }

    for (c in coin) {
        for (i in c..k) {
            dp[i] = min(dp[i], dp[i - c] + 1)
        }
    }

    if (dp[k] == 100001) {
        bw.write("-1")
    } else {
        bw.write("${dp[k]}")
    }

    bw.close()
    br.close()
}