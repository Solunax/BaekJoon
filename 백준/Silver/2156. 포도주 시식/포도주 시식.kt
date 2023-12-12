import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val wine = Array(n + 1) { 0 }
    val dp = Array(n + 1){0}

    for (i in 1..n) {
        wine[i] = br.readLine().toInt()
    }

    when (n) {
        1 -> {
            bw.write("${wine[1]}")
        }
        2 -> {
            bw.write("${wine[1] + wine[2]}")
        }
        else -> {
            dp[1] = wine[1]
            dp[2] = wine[1] + wine[2]

            for (i in 3 .. n) {
                dp[i] = max(dp[i - 1],
                    max(dp[i - 2] + wine[i], dp[i - 3] + wine[i] + wine[i - 1])
                )
            }

            bw.write("${dp[n]}")
        }
    }

    bw.close()
    br.close()
}