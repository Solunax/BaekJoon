import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: LongArray
lateinit var sequence: LongArray

fun main() {
    val (n, m, r) = br.readLine().split(" ").map{ it.toInt() }
    map = Array(n + 1){ ArrayList() }
    visit = LongArray(n + 1)
    sequence = LongArray(n + 1){-1}

    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        map[u].add(v)
        map[v].add(u)
    }

    map.forEach {
        it.sort()
    }

    search(r)

    var sum = 0L
    for (i in 1 .. n) {
        sum += visit[i] * sequence[i]
    }
    bw.write("$sum")

    bw.close()
    br.close()
}

fun search(start: Int) {
    val queue = LinkedList<Int>()
    var index = 1L

    queue.add(start)
    visit[start] = index++
    sequence[start] = 0

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (node in map[now]) {
            if(visit[node] == 0L) {
                queue.add(node)
                visit[node] = index++
                sequence[node] = sequence[now] + 1
            }
        }
    }
}