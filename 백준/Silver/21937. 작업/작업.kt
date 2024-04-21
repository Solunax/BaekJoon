import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
var count = 0
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: BooleanArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    map = Array(n + 1) { ArrayList() }
    visit = BooleanArray(n + 1)

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        map[b].add(a)
    }

    val job = br.readLine().toInt()
    search(job)

    bw.write("$count")

    bw.close()
    br.close()
}

fun search(job: Int) {
    val queue = LinkedList<Int>()
    queue.add(job)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        map[now].forEach { need ->
            if (need != 0 && !visit[need]) {
                queue.add(need)
                visit[need] = true
                count++
            }
        }
    }
}