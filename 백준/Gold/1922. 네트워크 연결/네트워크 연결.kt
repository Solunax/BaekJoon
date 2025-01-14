import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val nodes = Array<ArrayList<Node>>(n + 1) { ArrayList() }
    val visit = BooleanArray(n + 1)
    val pq = PriorityQueue<Node>()

    repeat(m) {
        val (v1, v2, weight) = br.readLine().split(" ").map { it.toInt() }

        nodes[v1].add(Node(v2, weight))
        nodes[v2].add(Node(v1, weight))
    }

    var sum = 0
    pq.offer(Node(1, 0))
    while (pq.isNotEmpty()) {
        val now = pq.poll()
        val t = now.target
        val w = now.weight

        if (!visit[t]) {
            visit[t] = true
            sum += w

            for (node in nodes[t]) {
                if (!visit[node.target]) {
                    pq.offer(node)
                }
            }
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}

class Node(val target: Int, val weight: Int) : Comparable<Node> {
    override fun compareTo(other: Node): Int {
        return this.weight - other.weight
    }
}