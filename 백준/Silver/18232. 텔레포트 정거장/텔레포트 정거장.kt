import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var tp: Array<ArrayList<Int>>
lateinit var time: IntArray
var n = 0
var s = 0
var e = 0

fun main() {
    val nm = br.readLine().split(" ").map { it.toInt() }
    val se = br.readLine().split(" ").map { it.toInt() }
    n = nm[0]
    s = se[0]
    e = se[1]
    tp = Array(n + 1) { ArrayList() }
    time = IntArray(n + 1)

    repeat(nm[1]) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        tp[v1].add(v2)
        tp[v2].add(v1)
    }

    search()
    bw.write("${time[e]}")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Int>()
    queue.add(s)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now == e) {
            return
        }

        if (now + 1 <= n && time[now + 1] == 0) {
            queue.add(now + 1)
            time[now + 1] = time[now] + 1
        }

        if (now - 1 >= 1 && time[now - 1] == 0) {
            queue.add(now - 1)
            time[now - 1] = time[now] + 1
        }

        if (tp[now].isNotEmpty()) {
            for (tPoint in tp[now]) {
                if (time[tPoint] == 0) {
                    queue.add(tPoint)
                    time[tPoint] = time[now] + 1
                }
            }
        }
    }
}