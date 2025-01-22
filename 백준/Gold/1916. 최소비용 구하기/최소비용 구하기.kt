import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var bus: Array<ArrayList<Bus>>
lateinit var visit: BooleanArray
lateinit var dist: IntArray
var start = 0
var end = 0

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    bus = Array(n + 1) { ArrayList() }
    visit = BooleanArray(n + 1)
    dist = IntArray(n + 1) { Int.MAX_VALUE }

    repeat(m) {
        val (s, e, c) = br.readLine().split(" ").map { it.toInt() }
        bus[s].add(Bus(e, c))
    }

    val dest = br.readLine().split(" ").map { it.toInt() }
    start = dest[0]
    end = dest[1]

    search()
    bw.write("${dist[end]}")

    bw.close()
    br.close()
}

fun search() {
    val pq = PriorityQueue<Bus>()
    pq.offer(Bus(start, 0))
    dist[start] = 0

    while (pq.isNotEmpty()) {
        val now = pq.poll()

        if (!visit[now.end]) {
            visit[now.end] = true

            for (b in bus[now.end]) {
                if (!visit[b.end] && dist[b.end] > dist[now.end] + b.cost) {
                    dist[b.end] = dist[now.end] + b.cost
                    pq.offer(Bus(b.end, dist[b.end]))
                }
            }
        }
    }
}

class Bus(val end: Int, val cost: Int) : Comparable<Bus> {
    override fun compareTo(other: Bus): Int {
        return this.cost - other.cost
    }
}