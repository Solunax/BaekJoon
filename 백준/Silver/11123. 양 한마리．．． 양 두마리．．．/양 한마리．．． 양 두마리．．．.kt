import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(1, -1, 0, 0)
val dy = listOf(0, 0, 1, -1)
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var h = 0
var w = 0

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toInt() }
        h = input[0]
        w = input[1]
        map = Array(h) { CharArray(w) }
        visit = Array(h) { BooleanArray(w) }

        repeat(h) {
            map[it] = br.readLine().toCharArray()
        }

        var result = 0

        for (y in 0 until h) {
            for (x in 0 until w) {
                if (map[y][x] == '#' && !visit[y][x]) {
                    search(x, y)
                    result++
                }
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until w && ny in 0 until h &&
                !visit[ny][nx] && map[ny][nx] == '#') {
                visit[ny][nx] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}