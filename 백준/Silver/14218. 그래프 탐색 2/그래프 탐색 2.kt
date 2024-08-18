import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<BooleanArray>
lateinit var distance: Array<Int>
var n = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    val m = input[1]
    map = Array(n + 1) { BooleanArray(n + 1) }
    distance = Array(n + 1) { Int.MAX_VALUE }

    repeat(m) {
        val st = StringTokenizer(br.readLine())
        val v1 = st.nextToken().toInt()
        val v2 = st.nextToken().toInt()

        map[v1][v2] = true
        map[v2][v1] = true
    }

    repeat(br.readLine().toInt()) {
        val st = StringTokenizer(br.readLine())
        val v1 = st.nextToken().toInt()
        val v2 = st.nextToken().toInt()

        map[v1][v2] = true
        map[v2][v1] = true
        search()

        for (i in 1..n) {
            if (distance[i] == Int.MAX_VALUE) {
                bw.write("-1 ")
            } else {
                bw.write("${distance[i]} ")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun search() {
    val visit = BooleanArray(n + 1)
    val queue = LinkedList<Node>()
    queue.add(Node(1, 0))

    while (queue.isNotEmpty()) {
        val (node, move) = queue.poll()

        if (distance[node] > move) {
            distance[node] = move
        }

        visit[node] = true
        for (next in 1..n) {
            if (map[node][next] && !visit[next]) {
                queue.add(Node(next, move + 1))
                visit[next] = true
            }
        }
    }

}

data class Node(val point: Int, val move: Int)