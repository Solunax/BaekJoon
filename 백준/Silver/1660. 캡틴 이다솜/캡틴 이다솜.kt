import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { Int.MAX_VALUE }
    val cannonBall = Array(122) { 1 }
    val tri = Array(122) { 1 }

    var cannonPlus = 2
    for (i in 2 until 122) {
        cannonBall[i] = cannonBall[i - 1] + cannonPlus
        cannonPlus += 1

        tri[i] = cannonBall[i] + tri[i - 1]
    }

    dp[0] = 0
    dp[1] = 1

    for (i in 2..n) {
        for (j in 1 until 122) {
            if (tri[j] > i) {
                break
            }

            dp[i] = min(dp[i], dp[i - tri[j]] + 1)
        }
    }
    bw.write("${dp[n]}")

    bw.close()
    br.close()
}