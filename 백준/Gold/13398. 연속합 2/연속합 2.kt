import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val number = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n){ Array(2){0} }
    var result = number[0]
    dp[0][0] = number[0]
    dp[0][1] = number[0]

    for (i in 1 until n) {
        dp[i][0] = max(dp[i - 1][0] + number[i], number[i])
        dp[i][1] = max(dp[i - 1][0], dp[i - 1][1] + number[i])

        result = max(result, max(dp[i][0], dp[i][1]))
    }
    bw.write("$result")

    bw.close()
    br.close()
}