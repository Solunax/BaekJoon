import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Node>>
lateinit var visit: BooleanArray
var result = 0L

fun main() {
    val n = br.readLine().toInt()
    map = Array(n + 1) { ArrayList() }
    visit = BooleanArray(n + 1)

    repeat(n - 1) {
        val (p1, p2, distance) = br.readLine().split(" ").map { it.toInt() }
        map[p1].add(Node(p2, distance))
        map[p2].add(Node(p1, distance))
    }

    visit[1] = true
    search(1, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(now: Int, distance: Long) {
    result = max(result, distance)

    for (v in map[now]) {
        if (!visit[v.nextPoint]) {
            visit[v.nextPoint] = true
            search(v.nextPoint, distance + v.distance)
        }
    }
}

data class Node(val nextPoint: Int, val distance: Int)