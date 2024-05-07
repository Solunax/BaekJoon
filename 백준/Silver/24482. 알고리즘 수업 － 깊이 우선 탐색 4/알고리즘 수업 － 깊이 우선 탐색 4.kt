import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
var r = 0
lateinit var map: Array<ArrayList<Int>>
lateinit var depth: IntArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    r = input[2]
    map = Array(n + 1) { ArrayList() }
    depth = IntArray(n + 1) { -1 }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        map[v1].add(v2)
        map[v2].add(v1)
    }

    map.forEach {
        it.sortDescending()
    }

    depth[r] = 0
    search(r)

    for (i in 1..n) {
        bw.write("${depth[i]}\n")
    }

    bw.close()
    br.close()
}

fun search(start: Int) {
    for (i in 0 until map[start].size) {
        val next = map[start][i]
        if (depth[next] == -1) {
            depth[next] = depth[start] + 1
            search(next)
        }
    }
}