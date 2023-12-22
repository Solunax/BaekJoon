import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n + 1) { List(2) { 0 } }
    val dp = Array(n + 1) { 1 }
    var len = 0

    repeat(n) {
        arr[it + 1] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    arr.sortWith { o1, o2 ->
        o1[0] - o2[0]
    }

    for (i in 1 .. n) {
        for (j in 1 until i) {
            if (arr[i][1] > arr[j][1]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
            len = max(len, dp[i])
        }
    }
    bw.write("${n - len}")

    bw.close()
    br.close()
}