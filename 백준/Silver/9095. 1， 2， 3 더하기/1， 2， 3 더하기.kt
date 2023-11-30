import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(11) { 0 }
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4

    for (i in 4 .. 10) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        bw.write("${dp[n]}\n")
    }

    bw.close()
    br.close()
}