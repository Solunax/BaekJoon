import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(1000001) { 0 }
    var length = 0

    for (i in 1 .. n) {
        val num = arr[i]

        dp[num] = max(dp[num - 1] + 1, 1)
        length = max(length, dp[num])
    }
    bw.write("$length")

    bw.close()
    br.close()
}