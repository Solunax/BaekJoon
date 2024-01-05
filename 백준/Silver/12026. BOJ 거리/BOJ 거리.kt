import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val maxValue = Int.MAX_VALUE.toLong()
    val n = br.readLine().toInt()
    val road = br.readLine()
    val dp = Array(n) { maxValue }
    dp[0] = 0

    for (i in 1 until n) {
        for (j in 0 until i) {
            when (road[i]) {
                'B' -> {
                    if (road[j] == 'J') {
                        dp[i] = min(dp[i], dp[j] + (i - j) * (i - j))
                    }
                }
                'O' -> {
                    if (road[j] == 'B') {
                        dp[i] = min(dp[i], dp[j] + (i - j) * (i - j))
                    }
                }
                'J' -> {
                    if (road[j] == 'O') {
                        dp[i] = min(dp[i], dp[j] + (i - j) * (i - j))
                    }
                }
            }
        }
    }

    if (dp[n - 1] == maxValue) {
        bw.write("-1")
    } else {
        bw.write("${dp[n - 1]}")
    }

    bw.close()
    br.close()
}