import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(101){0L}

    repeat(6) {
        dp[it + 1] = it + 1L
    }

    for (i in 7 .. n) {
        for (j in 3..i) {
            dp[i] = max(dp[i], dp[i - j] * (j - 1))
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}