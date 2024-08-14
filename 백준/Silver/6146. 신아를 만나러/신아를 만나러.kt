import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val visit = Array(1001) { Array(1001) { false } }
var resultX = 0
var resultY = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var result = Int.MAX_VALUE

fun main() {
    val (x, y, n) = br.readLine().split(" ").map { it.toInt() }
    resultX = x + 500
    resultY = y + 500

    repeat(n) {
        val (px, py) = br.readLine().split(" ").map { it.toInt() + 500 }
        visit[py][px] = true
    }

    search()
    bw.write("$result")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<MoveData>()
    queue.add(MoveData(500, 500, 0))
    visit[500][500] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == resultX && now.y == resultY) {
            result = min(result, now.count)
            return
        }

        repeat(4) { i ->
            val nx = now.x + dx[i]
            val ny = now.y + dy[i]

            if (nx in 0..1000 && ny in 0..1000
                && !visit[ny][nx]) {
                queue.add(MoveData(nx, ny, now.count + 1))
                visit[ny][nx] = true
            }
        }
    }
}

data class MoveData(val x: Int, val y: Int, val count: Int)