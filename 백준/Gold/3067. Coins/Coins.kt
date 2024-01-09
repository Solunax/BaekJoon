import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        br.readLine()
        val coin = br.readLine().split(" ").map { it.toInt() }
        val m = br.readLine().toInt()
        val dp = Array(m + 1) { 0 }
        dp[0] = 1

        for (c in coin) {
            for (i in c..m) {
                dp[i] += dp[i - c]
            }
        }
        bw.write("${dp[m]}\n")
    }

    bw.close()
    br.close()
}