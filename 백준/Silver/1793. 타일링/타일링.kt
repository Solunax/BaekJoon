import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(251){ BigInteger("1") }
    dp[2] = BigInteger("3")
    for (i in 3 .. 250) {
        dp[i] = dp[i - 1].add(dp[i - 2].multiply(BigInteger("2")))
    }

    while (true) {
        val n = br.readLine()

        if (n.isNullOrEmpty()) {
            break
        }

        bw.write("${dp[n.toInt()]}\n")
    }

    bw.close()
    br.close()
}