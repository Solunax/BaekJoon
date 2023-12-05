import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val health = br.readLine().split(" ").map { it.toInt() }
    val happy = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(100){0}

    for (i in 0 until n) {
        for (j in 99 downTo health[i]) {
            dp[j] = max(dp[j - health[i]] + happy[i], dp[j])
        }
    }

    bw.write("${dp[99]}")

    bw.close()
    br.close()
}