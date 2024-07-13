import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var n = 0
var m = 0
var k = 0
var remain = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    k = input[2]
    val firstSpore = m
    remain = m

    map = Array(n) { IntArray(n) }
    visit = Array(n) { BooleanArray(n) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    for (y in 0 until n) {
        for (x in 0 until n) {
            if (!visit[y][x] && map[y][x] == 0) {
                search(x, y)
            }
        }
    }

    if (firstSpore == remain || remain < 0) {
        bw.write("IMPOSSIBLE")
    } else {
        bw.write("POSSIBLE\n$remain")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    var count = 1
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) { i ->
            val nx = now.first + dx[i]
            val ny = now.second + dy[i]

            if (nx in 0 until n && ny in 0 until n
                && !visit[ny][nx] && map[ny][nx] == 0
            ) {
                queue.add(Pair(nx, ny))
                visit[ny][nx] = true
                count++
            }
        }
    }

    var need = 1
    while (k * need < count) {
        need++
    }

    remain -= need
}