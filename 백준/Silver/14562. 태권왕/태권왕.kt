import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (s, t) = br.readLine().split(" ").map { it.toInt() }
        search(s, t)
    }

    bw.close()
    br.close()
}

fun search(s: Int, t: Int) {
    val queue = LinkedList<Score>()
    queue.add(Score(s, t, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        val p1 = now.p1
        val p2 = now.p2
        val count = now.count

        if (now.p1 == now.p2) {
            bw.write("${now.count}\n")
            return
        }

        if (p1 > p2) {
            continue
        }

        queue.add(Score(p1 * 2, p2 + 3, count + 1))
        queue.add(Score(p1 + 1, p2, count + 1))
    }
}

data class Score(val p1: Int, val p2: Int, val count: Int)