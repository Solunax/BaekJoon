import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val score = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 0 }

    for (i in 1..n) {
        var maxScore = Int.MIN_VALUE
        var minScore = Int.MAX_VALUE

        for (j in i downTo 1) {
            maxScore = max(maxScore, score[j])
            minScore = min(minScore, score[j])
            dp[i] = max(dp[i], maxScore - minScore + dp[j - 1])
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}