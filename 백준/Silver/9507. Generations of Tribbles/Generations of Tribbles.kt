import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(68) { 1L }
    dp[2] = 2
    dp[3] = 4

    for (i in 4 .. 67) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4]
    }

    repeat(br.readLine().toInt()) {
        bw.write("${dp[br.readLine().toInt()]}\n")
    }

    bw.close()
    br.close()
}