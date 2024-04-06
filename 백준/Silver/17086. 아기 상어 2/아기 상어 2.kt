import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
val dx = listOf(-1, 0, 1, -1, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, -1, -1, -1)
lateinit var map: Array<List<Int>>
lateinit var visit: Array<Array<Boolean>>

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n) { List(m) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    var result = Int.MIN_VALUE

    for (y in 0 until n) {
        for (x in 0 until m) {
            if (map[y][x] != 1) {
                result = max(result, getDistance(x, y))
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun getDistance(x: Int, y: Int): Int {
    val queue = LinkedList<Position>()
    queue.add(Position(x, y, 0))
    visit = Array(n) { Array(m) { false } }
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(8) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until m && ny in 0 until n) {
                if (!visit[ny][nx]) {
                    if (map[ny][nx] == 1) {
                        return now.distance + 1
                    }

                    visit[ny][nx] = true
                    queue.add(Position(nx, ny, now.distance + 1))
                }
            }
        }
    }

    return 0
}

data class Position(val x: Int, val y: Int, val distance: Int)