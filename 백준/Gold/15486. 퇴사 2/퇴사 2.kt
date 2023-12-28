import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val time = Array(n + 2) { 0 }
    val money = Array(n + 2) { 0 }
    val dp = Array(n + 2) { 0 }

    for (i in 1..n) {
        val (t, m) = br.readLine().split(" ").map { it.toInt() }
        time[i] = t
        money[i] = m
    }

    var maxMoney = 0
    for (i in 1..n + 1) {
        if (maxMoney < dp[i]) {
            maxMoney = dp[i]
        }

        val d = i + time[i]
        if (d <= n + 1) {
            dp[d] = max(dp[d], maxMoney + money[i])
        }
    }
    bw.write("$maxMoney")

    bw.close()
    br.close()
}