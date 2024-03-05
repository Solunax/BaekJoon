import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<List<Int>>
var n = 0
var l = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    n = input[0]
    l = input[1]
    map = Array(n) { List(n) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (i in 0 until n) {
        if (check(0, i, 0)) {
            result++
        }

        if (check(i, 0, 1)) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun check(x: Int, y: Int, direction: Int): Boolean {
    val roadCheck = Array(n) { false }
    val height = Array(n) { 0 }

    for (i in 0 until n) {
        height[i] = when (direction) {
            0 -> map[y][x + i]
            1 -> map[y + i][x]
            else -> 0
        }
    }

    for (i in 0 until n - 1) {
        val diff = abs(height[i] - height[i + 1])

        if (diff == 0) {
            continue
        }

        if (diff > 1) {
            return false
        }

        if (height[i] + 1 == height[i + 1]) {
            for (j in i downTo i - l + 1) {
                if (j < 0 || height[i] != height[j] || roadCheck[j]) {
                    return false
                }

                roadCheck[j] = true
            }
        } else {
            for (j in i + 1..i + l) {
                if (j >= n || height[i + 1] != height[j] || roadCheck[j]) {
                    return false
                }

                roadCheck[j] = true
            }
        }
    }

    return true
}