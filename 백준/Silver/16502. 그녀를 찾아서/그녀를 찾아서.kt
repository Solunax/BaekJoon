import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Pair<Int, Double>>>
val result = Array(4) { 0.0 }
var n = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(4) { ArrayList() }

    repeat(br.readLine().toInt()) {
        val input = br.readLine()
        map[input[0] - 'A'].add(Pair(input[2] - 'A', input.substring(4).toDouble()))
    }

    repeat(4) { i ->
        search(i, 0.25, 0)
    }

    repeat(4) { i ->
        bw.write("%.2f\n".format(result[i]))
    }

    bw.close()
    br.close()
}

fun search(now: Int, percent: Double, count: Int) {
    if (count == n) {
        result[now] += percent * 100
        return
    }

    for (node in map[now]) {
        search(node.first, percent * node.second, count + 1)
    }
}