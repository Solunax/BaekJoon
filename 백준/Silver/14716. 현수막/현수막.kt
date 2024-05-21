import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var n = 0
var m = 0
val dx = listOf(-1, 0, 1, -1, 0, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, 0, -1, -1, -1)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    n = input[0]
    m = input[1]
    map = Array(n) { IntArray(m) }
    visit = Array(n) { BooleanArray(m) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    for (y in 0 until n) {
        for (x in 0 until m) {
            if (map[y][x] != 0 && !visit[y][x]) {
                search(x, y)
                result++
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

        repeat(9) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] == 1 && !visit[ny][nx]
            ) {
                visit[ny][nx] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}