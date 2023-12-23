import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n + 1) { List(3) { 0 } }
    val maxDp = Array(n + 1) { Array(3) { 0 } }
    val minDp = Array(n + 1) { Array(3) { 0 } }

    for (i in 1..n) {
        arr[i] = br.readLine().split(" ").map { it.toInt() }
    }

    for (i in 1..n) {
        maxDp[i][0] = max(maxDp[i - 1][0], maxDp[i - 1][1]) + arr[i][0]
        maxDp[i][1] = max(maxDp[i - 1][0], max(maxDp[i - 1][1], maxDp[i - 1][2])) + arr[i][1]
        maxDp[i][2] = max(maxDp[i - 1][1], maxDp[i - 1][2]) + arr[i][2]

        minDp[i][0] = min(minDp[i - 1][0], minDp[i - 1][1]) + arr[i][0]
        minDp[i][1] = min(minDp[i - 1][0], min(minDp[i - 1][1], minDp[i - 1][2])) + arr[i][1]
        minDp[i][2] = min(minDp[i - 1][1], minDp[i - 1][2]) + arr[i][2]
    }

    var maxScore = 0
    var minScore = Int.MAX_VALUE

    repeat(3) {
        maxScore = max(maxScore, maxDp[n][it])
        minScore = min(minScore, minDp[n][it])
    }
    bw.write("$maxScore $minScore")

    bw.close()
    br.close()
}