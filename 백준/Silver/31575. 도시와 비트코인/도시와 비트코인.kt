import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
val dx = listOf(1, 0)
val dy = listOf(0, 1)
var n = 0
var m = 0
var result = false

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[1]
    m = input[0]

    map = Array(n) { IntArray(m) }
    visit = Array(n) { BooleanArray(m) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    search()

    if (result) {
        bw.write("Yes")
    } else {
        bw.write("No")
    }

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Location>()
    queue.add(Location(0, 0))
    visit[0][0] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == m - 1 && now.y == n - 1) {
            result = true
            return
        }

        repeat(2) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] != 0 && !visit[ny][nx]) {
                queue.add(Location(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}

data class Location(val x: Int, val y: Int)