import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine().split(" ").map { it.toDouble() }

        if (input[0] == 0.0 && input[1] == 0.0) {
            break
        }

        val n = input[0].toInt()
        val m = (input[1] * 100).toInt()
        val dp = Array(m + 1){0}

        repeat(n) {
            val candy = br.readLine().split(" ").map { it.toDouble() }
            val calorie = candy[0].toInt()
            val price = (candy[1] * 100 + 0.5).toInt()

            for (i in price .. m) {
                dp[i] = max(dp[i], dp[i - price] + calorie)
            }
        }
        bw.write("${dp[m]}\n")
    }

    bw.close()
    br.close()
}