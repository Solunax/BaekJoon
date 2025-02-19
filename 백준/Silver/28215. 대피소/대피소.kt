import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<List<Int>>
var n = 0
var k = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = Int.MAX_VALUE
    n = input[0]
    k = input[1]
    map = Array(n) { List(2) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    when (k) {
        1 -> {
            for (a in 0 until n) {
                result = min(result, getDistance(a, a, a))
            }
        }
        2 -> {
            for (a in 0 until n - 1) {
                for (b in a + 1 until n) {
                    result = min(result, getDistance(a, a, b))
                }
            }
        }
        3 -> {
            for (a in 0 until n - 2) {
                for (b in a + 1 until n - 1) {
                    for (c in b + 1 until n)
                        result = min(result, getDistance(a, b, c))
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun getDistance(a: Int, b: Int, c: Int): Int {
    var distance = 0

    for (i in 0 until n) {
        val t1 = abs(map[i][0] - map[a][0]) + abs(map[i][1] - map[a][1])
        val t2 = abs(map[i][0] - map[b][0]) + abs(map[i][1] - map[b][1])
        val t3 = abs(map[i][0] - map[c][0]) + abs(map[i][1] - map[c][1])

        distance = max(distance, minOf(t1, t2, t3))
    }

    return distance
}