import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = Array(10) { CharArray(10) }
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var result = Int.MAX_VALUE

fun main() {
    var lakeX = 0
    var lakeY = 0

    repeat(10) { y ->
        map[y] = br.readLine().toCharArray()

        for (x in 0 until 10) {
            if (map[y][x] == 'L') {
                lakeX = x
                lakeY = y
            }
        }
    }

    search(lakeX, lakeY)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(startX: Int, startY: Int) {
    val queue = LinkedList<Node>()
    val visit = Array(10) { BooleanArray(10) }
    queue.add(Node(startX, startY, 0))
    visit[startY][startX] = true

    while (queue.isNotEmpty()) {
        val (x, y, move) = queue.poll()

        if (map[y][x] == 'B') {
            result = min(result, move - 1)
        }

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (nx in 0 until 10 && ny in 0 until 10
                && !visit[ny][nx] && map[ny][nx] != 'R') {
                queue.add(Node(nx, ny, move + 1))
                visit[y][x] = true
            }
        }
    }
}

data class Node(val x: Int, val y: Int, val move: Int)