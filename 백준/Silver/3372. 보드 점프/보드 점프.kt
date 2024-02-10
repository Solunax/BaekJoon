import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n) { List(n) { "" } }
    val dp = Array(n) { Array(n) { BigInteger.ZERO } }

    repeat(n) {
        arr[it] = br.readLine().split(" ")
    }

    dp[0][0] = BigInteger.ONE

    for (y in 0 until n) {
        for (x in 0 until n) {
            val dist = arr[y][x].toInt()

            if (dist != 0) {
                val down = y + dist
                val right = x + dist

                if (down < n) {
                    dp[down][x] += dp[y][x]
                }

                if (right < n) {
                    dp[y][right] += dp[y][x]
                }

            }
        }
    }
    bw.write("${dp[n - 1][n - 1]}")

    bw.close()
    br.close()
}