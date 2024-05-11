import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
var r = 0
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: IntArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    r = input[2]
    map = Array(n + 1) { ArrayList() }
    visit = IntArray(n + 1) { -1 }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        map[v1].add(v2)
        map[v2].add(v1)
    }

    map.forEach {
        it.sort()
    }

    visit[r] = 0
    search(r)

    for (i in 1..n) {
        bw.write("${visit[i]}\n")
    }

    bw.close()
    br.close()
}

fun search(start: Int) {
    val queue = LinkedList<Int>()
    queue.add(start)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (v in map[now]) {
            if (visit[v] == -1) {
                visit[v] = visit[now] + 1
                queue.add(v)
            }
        }
    }
}