import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var apple: List<Int>
var result = 0

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    map = Array(n) { ArrayList() }

    repeat(n - 1) {
        val (p, c) = br.readLine().split(" ").map { it.toInt() }
        map[p].add(c)
    }
    apple = br.readLine().split(" ").map { it.toInt() }

    search(k)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(k: Int) {
    val queue = LinkedList<Node>()
    queue.add(Node(0, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (apple[now.n] == 1) {
            result++
        }

        for (v in map[now.n]) {
            if (now.distance + 1 <= k) {
                queue.add(Node(v, now.distance + 1))
            }
        }
    }
}

data class Node(val n: Int, val distance: Int)