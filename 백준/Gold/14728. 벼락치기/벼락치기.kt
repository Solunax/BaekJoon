import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, t) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(t + 1) { 0 }

    repeat(n) {
        val (time, score) = br.readLine().split(" ").map { it.toInt() }

        for (i in t downTo time) {
            dp[i] = max(dp[i], dp[i - time] + score)
        }
    }
    bw.write("${dp[t]}")

    bw.close()
    br.close()
}