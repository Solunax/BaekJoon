import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: BooleanArray
lateinit var length: IntArray
var distance = 0

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    map = Array(n + 1) { ArrayList() }
    visit = BooleanArray(n + 1)
    length = IntArray(n + 1)

    repeat(m) {
        val (s, e) = br.readLine().split(" ").map { it.toInt() }

        map[s].add(e)
        map[e].add(s)
    }

    search()
    var hide = 0
    var count = 0

    for (i in 1..n) {
        if (length[i] == distance) {
            if (hide == 0) {
                hide = i
            }
            count++
        }
    }
    bw.write("$hide $distance $count")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Node>()
    queue.add(Node(1, 0))
    visit[1] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        distance = max(distance, now.length)
        length[now.v] = now.length

        for (v in map[now.v]) {
            if (!visit[v]) {
                queue.add(Node(v, now.length + 1))
                visit[v] = true
            }
        }
    }
}

data class Node(val v: Int, val length: Int)