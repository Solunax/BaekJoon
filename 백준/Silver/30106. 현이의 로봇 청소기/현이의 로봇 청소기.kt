import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var n = 0
var m = 0
var k = 0
var activate = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    k = input[2]

    map = Array(n) { IntArray(m) }
    visit = Array(n) { BooleanArray(m) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    for (y in 0 until n) {
        for (x in 0 until m) {
            if (!visit[y][x]) {
                search(x, y)
                activate++
            }
        }
    }
    bw.write("$activate")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Location>()
    queue.add(Location(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && abs(map[now.y][now.x] - map[ny][nx]) <= k
                && !visit[ny][nx]
            ) {
                queue.add(Location(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}

data class Location(val x: Int, val y: Int)