import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val jump = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 0 }

    dp[n] = 1

    for (i in n - 1 downTo 1) {
        val temp = i + jump[i] + 1

        dp[i] = if (temp > n) {
            1
        } else {
            dp[temp] + 1
        }
    }

    for (i in 1..n) {
        bw.write("${dp[i]} ")
    }

    bw.close()
    br.close()
}