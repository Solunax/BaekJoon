import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var visit: LongArray
lateinit var sequence: LongArray
var index = 1L

fun main() {
    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    map = Array(n + 1) { ArrayList() }
    visit = LongArray(n + 1)
    sequence = LongArray(n + 1) { -1 }

    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        map[u].add(v)
        map[v].add(u)
    }

    map.forEach {
        it.sortDescending()
    }

    search(r, 0)

    var sum = 0L
    for (i in 1..n) {
        sum += visit[i] * sequence[i]
    }
    bw.write("$sum")

    bw.close()
    br.close()
}

fun search(now: Int, seq: Long) {
    sequence[now] = seq
    visit[now] = index++

    for (v in map[now]) {
        if (visit[v] == 0L) {
            search(v, seq + 1)
        }
    }
}