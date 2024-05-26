import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var n = 0
var m = 0
var result = -1
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var sx = 0
    var sy = 0
    n = input[0]
    m = input[1]
    map = Array(n) { IntArray(m) }
    visit = Array(n) { BooleanArray(m) }

    repeat(n) {
        val arr = br.readLine().split("").filter { v -> v.isNotEmpty() }.map { v -> v.toInt() }.toIntArray()
        map[it] = arr

        for (i in 0 until m) {
            if (arr[i] == 2) {
                sx = i
                sy = it
            }
        }
    }

    search(sx, sy)

    if (result != -1) {
        bw.write("TAK\n$result")
    } else {
        bw.write("NIE")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Loc>()
    queue.add(Loc(x, y, 0))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (map[now.y][now.x] in 3..5) {
            result = now.mv
            return
        }

        repeat(4) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && map[ny][nx] != 1 && !visit[ny][nx]
            ) {
                queue.add(Loc(nx, ny, now.mv + 1))
                visit[ny][nx] = true
            }
        }
    }
}

data class Loc(val x: Int, val y: Int, val mv: Int)