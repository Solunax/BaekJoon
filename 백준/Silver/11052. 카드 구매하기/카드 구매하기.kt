import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val cost = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 0 }

    for (i in 1..n) {
        for (j in 1..i) {
            dp[i] = max(dp[i], dp[i - j] + cost[j])
        }
    }

    bw.write("${dp[n]}")

    bw.close()
    br.close()
}