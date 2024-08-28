import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<BooleanArray>
lateinit var distance: Array<IntArray>
lateinit var visit: BooleanArray
var n = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    val m = input[1]
    map = Array(n + 1) { BooleanArray(n + 1) }
    distance = Array(n + 1) { IntArray(n + 1) }

    repeat(n - 1) {
        val (v1, v2, dist) = br.readLine().split(" ").map { it.toInt() }
        map[v1][v2] = true
        map[v2][v1] = true
        distance[v1][v2] = dist
        distance[v2][v1] = dist
    }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        search(v1, v2)
    }

    bw.close()
    br.close()
}

fun search(start: Int, end: Int) {
    val queue = LinkedList<Node>()
    visit = BooleanArray(n + 1)
    queue.add(Node(start, 0))
    visit[start] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.node == end) {
            bw.write("${now.total}\n")
            return
        }

        for (i in 1..n) {
            if (map[now.node][i] && !visit[i]) {
                queue.add(Node(i, now.total + distance[now.node][i]))
                visit[i] = true
            }
        }
    }
}

data class Node(val node: Int, val total: Int)