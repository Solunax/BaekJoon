import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var n = 0
var result = 0
val dx = listOf(-1, 1, -1, 1, -1, 0, 1)
val dy = listOf(-1, -1, 0, 0, 1, -1, 1)

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { CharArray(n) }
    var sx = -1
    var sy = -1

    repeat(n) { y ->
        map[y] = br.readLine().toCharArray()

        if (sx == -1) {
            for (x in 0 until n) {
                if (map[y][x] == 'F') {
                    sx = x
                    sy = y
                }
            }
        }
    }

    search(sx, sy)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Location>()
    queue.add(Location(x, y))
    visit = Array(n) { BooleanArray(n) }
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(7) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until n && ny in 0 until n
                && map[ny][nx] != '#' && !visit[ny][nx]) {
                queue.add(Location(nx, ny))
                result++
                visit[ny][nx] = true
            }
        }
    }
}

data class Location(val x: Int, val y: Int)