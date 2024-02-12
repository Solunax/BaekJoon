import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(191230) { 0 }
    val div = 1000000007

    dp[1] = 1
    dp[2] = 2

    for (i in 3 until 191230) {
        dp[i] = (dp[i - 1] + dp[i - 2]) % div
    }

    repeat(br.readLine().toInt()) {
        bw.write("${dp[br.readLine().toInt()]}\n")
    }

    bw.close()
    br.close()
}