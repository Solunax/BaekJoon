import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val bridge = Array(21) { Array(2) { 0 } }
    val dp = Array(21) { Array(2) { 987654321 } }

    for (i in 1 until n) {
        val (s, b) = br.readLine().split(" ").map { it.toInt() }
        bridge[i][0] = s
        bridge[i][1] = b
    }

    val k = br.readLine().toInt()

    dp[0][0] = 0
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 0
    dp[2][0] = bridge[1][0]
    dp[3][0] = min(dp[2][0] + bridge[2][0], dp[0][0] + bridge[1][1])

    for (i in 4..n) {
        dp[i][0] = min(dp[i - 1][0] + bridge[i - 1][0], dp[i - 2][0] + bridge[i - 2][1])
        dp[i][1] = min(dp[i - 1][1] + bridge[i - 1][0], min(dp[i - 2][1] + bridge[i - 2][1], dp[i - 3][0] + k))
    }
    bw.write("${min(dp[n][0], dp[n][1])}")

    bw.close()
    br.close()
}