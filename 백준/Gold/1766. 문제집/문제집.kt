import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array<ArrayList<Int>>(n + 1) { ArrayList() }
    val indegree = IntArray(n + 1)
    val pq = PriorityQueue<Int>()

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        arr[a].add(b)
        indegree[b]++
    }

    for (i in 1..n) {
        if (indegree[i] == 0) {
            pq.offer(i)
        }
    }

    while (pq.isNotEmpty()) {
        val now = pq.poll()
        bw.write("$now ")

        for (next in arr[now]) {
            indegree[next]--

            if (indegree[next] == 0) {
                pq.offer(next)
            }
        }
    }

    bw.close()
    br.close()
}