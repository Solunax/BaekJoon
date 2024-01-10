import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1){0}

    repeat(k) {
        val (l, t) = br.readLine().split(" ").map { it.toInt() }

        for (i in n downTo 1) {
            if (t <= i) {
                dp[i] = max(dp[i], dp[i - t] + l)
            }
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}