import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var r = 0
var c = 0
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var dx = listOf(0, 0, 1, -1)
var dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    r = input[0]
    c = input[1]
    map = Array(r) { CharArray(c) }
    visit = Array(r) { BooleanArray(c) }

    repeat(r) {
        map[it] = br.readLine().toCharArray()
    }

    for (y in 0 until r) {
        for (x in 0 until c) {
            if (map[y][x] == '#' && !visit[y][x]) {
                result++
                checkGrass(x, y)
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun checkGrass(x: Int, y: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) { i ->
            val nx = now.first + dx[i]
            val ny = now.second + dy[i]

            if (nx in 0 until c && ny in 0 until r
                && map[ny][nx] == '#' && !visit[ny][nx]
            ) {
                visit[ny][nx] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}