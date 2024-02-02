import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val bridge = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 0 }
    dp[1] = 1

    for (i in 1..n) {
        if (dp[i] == 1) {
            for (j in i + 1..n) {
                val energy = (j - i) * (1 + abs(bridge[i] - bridge[j]))
                if (energy <= k) {
                    dp[j] = 1
                }
            }
        }
    }

    if (dp[n] == 1) {
        bw.write("YES")
    } else {
        bw.write("NO")
    }

    bw.close()
    br.close()
}