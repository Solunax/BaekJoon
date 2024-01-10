import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1){0}

    repeat(m) {
        val (t, p) = br.readLine().split(" ").map { it.toInt() }

        for (i in n downTo t) {
                dp[i] = max(dp[i], dp[i - t] + p)
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}