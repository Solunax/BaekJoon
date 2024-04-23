import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = Array(5) { IntArray(5) }
val visit = Array(5) { BooleanArray(5) }
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var result = -1

fun main() {
    repeat(5) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    val (y, x) = br.readLine().split(" ").map { it.toInt() }

    search(x, y)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Loc>()
    queue.add(Loc(x, y, 0))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (map[now.y][now.x] == 1) {
            result = now.m
            return
        }

        repeat(4) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until 5 && ny in 0 until 5) {
                if (map[ny][nx] != -1 && !visit[ny][nx]) {
                    queue.add(Loc(nx, ny, now.m + 1))
                    visit[ny][nx] = true
                }
            }
        }
    }
}

data class Loc(val x: Int, val y: Int, val m: Int)