import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1) { 0 }
    val route = Array(n + 1) { 0 }

    for (i in 2..n) {
        dp[i] = dp[i - 1] + 1
        route[i] = i - 1

        if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
            dp[i] = dp[i / 2] + 1
            route[i] = i / 2
        }

        if (i % 3 == 0 && dp[i] > dp[i / 3] + 1) {
            dp[i] = dp[i / 3] + 1
            route[i] = i / 3
        }
    }
    bw.write("${dp[n]}\n")

    var now = n

    for (i in 0 .. dp[n]) {
        bw.write("$now ")
        now = route[now]
    }

    bw.close()
    br.close()
}