import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val stuff = Array(n + 1) { Array(2) { 0 } }
    val dp = Array(k + 1) { 0 }

    for (i in 1..n) {
        val (weight, value) = br.readLine().split(" ").map { it.toInt() }
        stuff[i][0] = weight
        stuff[i][1] = value
    }

    for (i in 1..n) {
        for (j in k downTo stuff[i][0]) {
            if (j - stuff[i][0] >= 0) {
                dp[j] = max(dp[j], dp[j - stuff[i][0]] + stuff[i][1])
            }
        }
    }
    bw.write("${dp[k]}")

    bw.close()
    br.close()
}