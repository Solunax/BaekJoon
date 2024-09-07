import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
val dx = listOf(-1, 0, 1, -1, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, -1, -1, -1)
var r = 0
var c = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    map = Array(r) { IntArray(c) }
    visit = Array(r) { BooleanArray(c) }
    var result = 0

    repeat(r) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    for (y in 0 until r) {
        for (x in 0 until c) {
            if (map[y][x] != 0 && !visit[y][x]) {
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
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(8) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until c && ny in 0 until r
                && map[ny][nx] != 0 && !visit[ny][nx]) {
                queue.add(Pair(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}