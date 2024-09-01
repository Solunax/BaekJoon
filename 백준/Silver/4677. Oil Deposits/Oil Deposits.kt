import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
val dx = listOf(-1, 0, 1, -1, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, -1, -1, -1)
var n = 0
var m = 0

fun main() {
    while (true) {
        var result = 0
        val input = br.readLine().split(" ").map { it.toInt() }
        n = input[0]
        m = input[1]

        if (n == 0 && m == 0) {
            break
        }

        map = Array(n) { CharArray(m) }
        visit = Array(n) { BooleanArray(m) }

        repeat(n) {
            map[it] = br.readLine().toCharArray()
        }

        for (y in 0 until n) {
            for (x in 0 until m) {
                if (map[y][x] == '@' && !visit[y][x]) {
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

        repeat(8) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] == '@' && !visit[ny][nx]) {
                queue.add(Pair(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}