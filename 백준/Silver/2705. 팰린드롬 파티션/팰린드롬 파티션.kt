import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1001) { 1 }
    dp[1] = 1
    dp[2] = 2
    dp[3] = 2

    for (i in 4..1000) {
        for (j in 1..i / 2) {
            dp[i] += dp[j]
        }
    }

    repeat(br.readLine().toInt()) {
        bw.write("${dp[br.readLine().toInt()]}\n")
    }

    bw.close()
    br.close()
}