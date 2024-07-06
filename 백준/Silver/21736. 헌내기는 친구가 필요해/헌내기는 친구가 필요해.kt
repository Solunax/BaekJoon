import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
var result = 0
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var dx = listOf(0, 0, 1, -1)
var dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n) { CharArray(m) }
    visit = Array(n) { BooleanArray(m) }

    var startX = 0
    var startY = 0

    repeat(n) { y ->
        map[y] = br.readLine().toCharArray()

        for (x in 0 until m) {
            if (map[y][x] == 'I') {
                startX = x
                startY = y
            }
        }
    }

    search(startX, startY)

    if (result == 0) {
        bw.write("TT")
    } else {
        bw.write("$result")
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

        repeat(4) { i ->
            val nx = now.first + dx[i]
            val ny = now.second + dy[i]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] != 'X' && !visit[ny][nx]
            ) {
                if (map[ny][nx] == 'P') {
                    result++
                }

                visit[ny][nx] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}