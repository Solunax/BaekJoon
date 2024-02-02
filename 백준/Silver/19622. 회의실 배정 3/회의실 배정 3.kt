import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val person = Array(100000) { 0 }
    val dp = Array(100000) { 0 }

    repeat(n) {
        val (_, _, p) = br.readLine().split(" ").map { v -> v.toInt() }
        person[it] = p
    }

    dp[0] = person[0]
    dp[1] = max(person[0], person[1])

    for (i in 2 until n) {
        dp[i] = max(dp[i - 1], dp[i - 2] + person[i])
    }
    bw.write("${dp[n - 1]}")

    bw.close()
    br.close()
}