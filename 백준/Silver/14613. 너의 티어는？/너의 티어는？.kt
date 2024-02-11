import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, l, d) = br.readLine().split(" ").map { it.toDouble() }
    val dp = Array(21) { Array(3001){0.0} }
    val rank = Array(5){0.0}

    dp[0][2000] = 1.0

    for (i in 1 .. 20) {
        for (j in 1000 .. 3000) {
            if (dp[i - 1][j] == 0.0) {
                continue
            }

            dp[i][j + 50] += dp[i - 1][j] * w
            dp[i][j - 50] += dp[i - 1][j] * l
            dp[i][j] += dp[i - 1][j] * d
        }
    }

    for (i in 1000..3000){
        when(i) {
            in 1000 until 1500 -> rank[0] += dp[20][i]
            in 1500 until 2000 -> rank[1] += dp[20][i]
            in 2000 until 2500 -> rank[2] += dp[20][i]
            in 2500 until 3000 -> rank[3] += dp[20][i]
            else -> rank[4] += dp[20][i]
        }
    }

    for (p in rank) {
        bw.write("%.8f\n".format(p))
    }

    bw.close()
    br.close()
}