import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(65){ Array(10){0L} }

    repeat(10) {
        dp[1][it] = 1
    }

    for (i in 2 .. 64) {
        for (j in 0 .. 9) {
            for (k in j .. 9) {
                dp[i][j] += dp[i - 1][k]
            }
        }
    }

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        var sum = 0L

        repeat(10) {
            sum += dp[n][it]
        }
        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}