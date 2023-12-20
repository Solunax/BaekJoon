import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val coin = Array(n) { 0 }
    val dp = Array(k + 1) { 0 }
    dp[0] = 1

    repeat(n) {
        coin[it] = br.readLine().toInt()
    }

    for (c in coin) {
        for (i in c..k) {
            dp[i] += dp[i - c]
        }
    }
    bw.write("${dp[k]}")

    bw.close()
    br.close()
}