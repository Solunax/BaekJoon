import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val string = Array(3) { "" }

    repeat(3) {
        string[it] = br.readLine()
    }

    val dp = Array(string[0].length + 1) { Array(string[1].length + 1) { Array(string[2].length + 1) { 0 } } }

    for (i in 1..string[0].length) {
        val c1 = string[0][i - 1]

        for (j in 1..string[1].length) {
            val c2 = string[1][j - 1]

            for (k in 1..string[2].length) {
                val c3 = string[2][k - 1]

                dp[i][j][k] = if (c1 == c2 && c2 == c3) {
                    dp[i - 1][j - 1][k - 1] + 1
                } else {
                    max(dp[i - 1][j][k], max(dp[i][j - 1][k], dp[i][j][k - 1]))
                }
            }
        }
    }
    bw.write("${dp[string[0].length][string[1].length][string[2].length]}")

    bw.close()
    br.close()
}