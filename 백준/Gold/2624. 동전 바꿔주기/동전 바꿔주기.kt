import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val t = br.readLine().toInt()
    val k = br.readLine().toInt()
    val dp = Array(t + 1) { 0 }
    val coin = Array(k) { Pair(0, 0) }

    repeat(k) {
        val (p, n) = br.readLine().split(" ").map { v -> v.toInt() }
        coin[it] = Pair(p, n)
    }
    dp[0] = 1

    repeat(k) {
        val value = coin[it].first
        val count = coin[it].second

        for (m in t downTo value) {
            for (i in 1..count) {
                if (m - value * i < 0) {
                    break
                }

                dp[m] += dp[m - value * i]
            }
        }
    }
    bw.write("${dp[t]}")

    bw.close()
    br.close()
}