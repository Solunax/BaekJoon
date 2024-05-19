import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: BooleanArray
var a = 0
var b = 0
var n = 0
var m = 0

fun main() {
    val want = br.readLine().split(" ").map { it.toInt() }
    val input = br.readLine().split(" ").map { it.toInt() }
    a = want[0]
    b = want[1]
    n = input[0]
    m = input[1]

    map = Array(n + 1) { ArrayList() }
    visit = BooleanArray(n + 1)

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        map[v1].add(v2)
        map[v2].add(v1)
    }

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search(): Int {
    val queue = LinkedList<Node>()
    queue.add(Node(a, 0))
    visit[a] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.idx == b) {
            return now.count
        }

        for (i in map[now.idx]) {
            if (!visit[i]) {
                queue.add(Node(i, now.count + 1))
                visit[i] = true
            }
        }
    }

    return -1
}

data class Node(val idx: Int, val count: Int)