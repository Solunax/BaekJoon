import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var n = 0
var m = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    n = input[0]
    m = input[1]
    map = Array(n) { IntArray(m) }
    visit = Array(n) { BooleanArray(m) }

    val color = Array(n) { IntArray(m * 3) }

    repeat(n) {
        color[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    val t = br.readLine().toInt()

    for (y in 0 until n) {
        var xIdx = 0

        for (x in 0 until m) {
            var sum = 0

            repeat(3) {
                sum += color[y][xIdx + it]
            }
            xIdx += 3

            map[y][x] = if (sum / 3 >= t) {
                255
            } else {
                0
            }
        }
    }

    for (y in 0 until n) {
        for (x in 0 until m) {
            if (map[y][x] == 255 && !visit[y][x]) {
                result++
                search(x, y)
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Loc>()
    queue.add(Loc(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] == 255 && !visit[ny][nx]
            ) {
                queue.add(Loc(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}

data class Loc(val x: Int, val y: Int)