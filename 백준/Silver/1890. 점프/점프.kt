import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = Array(n) { Array(n) { 0 } }
    val dp = Array(n) { Array(n) { 0L } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    dp[0][0] = 1

    for (y in 0 until n) {
        for (x in 0 until n) {
            val move = map[y][x]

            if (move == 0) {
                break
            }

            if (x + move in 0 until n) {
                dp[y][x + move] += dp[y][x]
            }

            if (y + move in 0 until n) {
                dp[y + move][x] += dp[y][x]
            }
        }
    }
    bw.write("${dp[n-1][n-1]}")

    bw.close()
    br.close()
}