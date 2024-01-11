import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dp = Array(61) { Array(61) { Array(61) { Int.MAX_VALUE } } }
val attack = listOf(
    listOf(9, 3, 1), listOf(9, 1, 3),
    listOf(3, 9, 1), listOf(3, 1, 9),
    listOf(1, 9, 3), listOf(1, 3, 9)
)
var n = 0

fun main() {
    n = br.readLine().toInt()
    val scv = Array(3) { 0 }
    val input = br.readLine().split(" ").map { it.toInt() }.sortedDescending().toTypedArray()

    repeat(n) {
        scv[it] = input[it]
    }
    bw.write("${search(scv.clone(), 0)}")

    bw.close()
    br.close()
}

fun search(scv: Array<Int>, count: Int): Int {
    var check = false
    for (i in 0 until n) {
        if (scv[i] != 0) {
            check = true
            break
        }
    }

    if (!check) {
        return count
    } else {
        scv.sortDescending()

        if (dp[scv[0]][scv[1]][scv[2]] != Int.MAX_VALUE) {
            return dp[scv[0]][scv[1]][scv[2]]
        }

        repeat(6) {
            val damagedSCV = Array(3) { 0 }
            damagedSCV[0] = max(scv[0] - attack[it][0], 0)
            damagedSCV[1] = max(scv[1] - attack[it][1], 0)
            damagedSCV[2] = max(scv[2] - attack[it][2], 0)

            dp[scv[0]][scv[1]][scv[2]] = min(dp[scv[0]][scv[1]][scv[2]], search(damagedSCV, count + 1))
        }
    }

    return dp[scv[0]][scv[1]][scv[2]]
}