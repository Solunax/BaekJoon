import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, h, t) = br.readLine().split(" ").map { it.toInt() }
    val pq = PriorityQueue<Int>(reverseOrder())
    var count = 0

    repeat(n) {
        pq.add(br.readLine().toInt())
    }

    for (i in 0 until t) {
        if (pq.peek() < h || pq.peek() == 1) {
            break
        } else {
            pq.add(pq.poll() / 2)
            count++
        }
    }

    if (pq.peek() < h) {
        bw.write("YES\n$count")
    } else {
        bw.write("NO\n${pq.peek()}")
    }

    bw.close()
    br.close()
}