import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { Array(m + 1) { 0 } }
    val dp = Array(n + 1) { Array(m + 1) { 0 } }

    repeat(n) {
        map[it + 1] = arrayOf(0) + br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (x in 1 .. n) {
        for (y in 1 .. m) {
            dp[x][y] = map[x][y] + dp[x - 1][y] + dp[x][y - 1] - dp[x - 1][y - 1]
        }
    }

    repeat(br.readLine().toInt()) {
        val (x1, y1, x2 ,y2) = br.readLine().split(" ").map { it.toInt() }
        bw.write("${dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1]}\n")
    }

    bw.close()
    br.close()
}