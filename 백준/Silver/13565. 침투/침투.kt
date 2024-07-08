import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var dx = listOf(0, 0, 1, -1)
var dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    m = input[0]
    n = input[1]
    map = Array(m) { CharArray(n) }
    visit = Array(m) { BooleanArray(n) }

    repeat(m) {
        map[it] = br.readLine().toCharArray()
    }

    repeat(n) {
        if (map[0][it] == '0') {
            search(it, 0)
        }
    }

    var result = false
    repeat(n) {
        if (visit[m - 1][it]) {
            result = true
        }
    }

    if (result) {
        bw.write("YES")
    } else {
        bw.write("NO")
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

            if (nx in 0 until n && ny in 0 until m
                && map[ny][nx] != '1' && !visit[ny][nx]
            ) {
                visit[ny][nx] = true
                queue.add(Pair(nx, ny))
            }
        }
    }
}