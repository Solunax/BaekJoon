import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var n = 0
var m = 0
val dx = listOf(-2, -2, -1, -1, 1, 1, 2, 2)
val dy = listOf(-1, 1, -2, 2, -2, 2, -1, 1)
lateinit var result: IntArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val (y, x) = br.readLine().split(" ").map { it.toInt() - 1 }
    n = input[0]
    m = input[1]
    map = Array(n) { IntArray(n) { -1 } }
    visit = Array(n) { BooleanArray(n) }
    result = IntArray(m) { Int.MAX_VALUE }

    repeat(m) {
        val (my, mx) = br.readLine().split(" ").map { v -> v.toInt() - 1 }
        map[my][mx] = it
    }

    search(x, y)
    result.forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Node>()
    queue.add(Node(x, y, 0))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (map[now.y][now.x] != -1) {
            result[map[now.y][now.x]] = now.count
        }

        repeat(8) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until n && ny in 0 until n) {
                if (!visit[ny][nx]) {
                    queue.add(Node(nx, ny, now.count + 1))
                    visit[ny][nx] = true
                }
            }
        }
    }
}

data class Node(val x: Int, val y: Int, val count: Int)