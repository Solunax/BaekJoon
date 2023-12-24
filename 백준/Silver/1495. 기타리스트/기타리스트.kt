import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, s, m) = br.readLine().split(" ").map { it.toInt() }
    val volume = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(m + 1) { -1 }
    dp[s] = 0

    for (i in 1..n) {
        val arr = ArrayList<Int>()

        for (j in 0 .. m) {
            if (dp[j] == i - 1) {
                val v1 = j + volume[i]
                val v2 = j - volume[i]

                if (v1 in 0 .. m) {
                    arr.add(v1)
                }

                if (v2 in 0 .. m) {
                    arr.add(v2)
                }
            }
        }

        arr.forEach {
            dp[it] = i
        }
    }

    var maxValue = -1
    for (i in 0.. m) {
        if (dp[i] == n) {
            maxValue = max(maxValue, i)
        }
    }
    bw.write("$maxValue")

    bw.close()
    br.close()
}