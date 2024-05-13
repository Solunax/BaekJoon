import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n + 1) { IntArray(n + 1) { 999999999 } }

    for (i in 1..n) {
        for (j in 1..n) {
            if (i == j) {
                map[i][j] = 0
            }
        }
    }

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        map[a][b] = 1
        map[b][a] = 1
    }

    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                map[i][j] = min(map[i][j], map[i][k] + map[k][j])
            }
        }
    }

    var result = 0
    var minValue = Int.MAX_VALUE

    for (i in 1..n) {
        var sum = 0
        for (j in 1..n) {
            sum += map[i][j]
        }

        if (minValue > sum) {
            minValue = sum
            result = i
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}