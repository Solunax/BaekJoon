import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val stamp = Array(2){ Array(n + 1){0} }
        val dp = Array(2){ Array(n + 1){0} }

        for (i in 0 until 2) {
            stamp[i] = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }.toTypedArray()
        }

        dp[0][1] = stamp[0][1]
        dp[1][1] = stamp[1][1]

        for (i in 2 .. n) {
            dp[0][i] = max(dp[1][i - 1], dp[1][i - 2]) + stamp[0][i]
            dp[1][i] = max(dp[0][i - 1], dp[0][i - 2]) + stamp[1][i]
        }
        bw.write("${max(dp[0][n], dp[1][n])}\n")
    }

    bw.close()
    br.close()
}