import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1000001){0L}
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4 .. 1000000) {
        dp[i] = (dp[i - 1] + dp[i - 2] + dp[i - 3]) % 1000000009
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()

        bw.write("${dp[n]}\n")
    }

    bw.close()
    br.close()
}