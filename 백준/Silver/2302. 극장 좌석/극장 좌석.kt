import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val dp = Array(n + 1) { 0 }
    dp[0] = 1
    dp[1] = 1

    for (i in 2..n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    var result = 1
    var beforeFix = 0
    repeat(m) {
        val fix = br.readLine().toInt()
        result *= dp[fix - beforeFix - 1]
        beforeFix = fix
    }
    result *= dp[n - beforeFix]
    bw.write("$result")

    bw.close()
    br.close()
}