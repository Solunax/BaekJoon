import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val queue = PriorityQueue(br.readLine().split(" ").map { it.toLong() })

    repeat(m){
        val sum = queue.poll() + queue.poll()

        queue.offer(sum)
        queue.offer(sum)
    }

    var result = 0L
    queue.forEach {
        result += it
    }

    bw.write("$result")

    bw.close()
    br.close()
}