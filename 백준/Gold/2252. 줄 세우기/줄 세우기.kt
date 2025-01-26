import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array<ArrayList<Int>>(n + 1) { ArrayList() }
    val indegree = IntArray(n + 1)
    val queue = LinkedList<Int>()

    repeat(m) {
        val (front, back) = br.readLine().split(" ").map { it.toInt() }
        arr[front].add(back)
        indegree[back]++
    }

    for (i in 1..n) {
        if (indegree[i] == 0) {
            queue.offer(i)
        }
    }

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        bw.write("$now ")

        for (next in arr[now]) {
            indegree[next]--

            if (indegree[next] == 0) {
                queue.offer(next)
            }
        }
    }

    bw.close()
    br.close()
}