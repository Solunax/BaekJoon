import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(491) { BigInteger.ONE }

    for (i in 3..490) {
        dp[i] = dp[i - 1].add(dp[i - 2])
    }

    while (true) {
        val input = br.readLine().toInt()

        if (input == -1) {
            break
        }

        bw.write("Hour $input: ${dp[input]} cow(s) affected\n")
    }

    bw.close()
    br.close()
}