import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1000001){0L}
    dp[1] = 1
    dp[2] = 2
    dp[3] = 2
    dp[4] = 3
    dp[5] = 3
    dp[6] = 6

    for (i in 7 .. 1000000) {
        dp[i] = (dp[i - 2] + dp[i - 4] + dp[i - 6]) % 1000000009
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        bw.write("${dp[n]}\n")
    }

    bw.close()
    br.close()
}