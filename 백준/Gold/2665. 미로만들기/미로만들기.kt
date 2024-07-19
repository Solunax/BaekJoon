import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>
lateinit var count: Array<IntArray>
var n = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { CharArray(n) }
    count = Array(n) { IntArray(n) { Int.MAX_VALUE } }

    repeat(n) {
        map[it] = br.readLine().toCharArray()
    }

    search()
    bw.write("${count[n - 1][n - 1]}")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Node>()

    if (map[0][0] == '1') {
        count[0][0] = 0
        queue.add(Node(0, 0, 0))
    } else {
        count[0][0] = 1
        queue.add(Node(0, 0, 1))
    }

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) { i ->
            val nx = now.x + dx[i]
            val ny = now.y + dy[i]

            if ((nx in 0 until n && ny in 0 until n)) {
                if (map[ny][nx] == '0') {
                    if (now.breaking + 1 < count[ny][nx]) {
                        queue.add(Node(nx, ny, now.breaking + 1))
                        count[ny][nx] = now.breaking + 1
                    }
                } else {
                    if (now.breaking < count[ny][nx]) {
                        queue.add(Node(nx, ny, now.breaking))
                        count[ny][nx] = now.breaking
                    }
                }
            }
        }
    }
}

data class Node(val x: Int, val y: Int, val breaking: Int)