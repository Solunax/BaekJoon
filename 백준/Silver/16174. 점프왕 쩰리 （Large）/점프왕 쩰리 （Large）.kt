import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var result = "Hing"
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { IntArray(n) }
    visit = Array(n) { BooleanArray(n) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    search()
    bw.write(result)

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(0, 0))
    visit[0][0] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        val x = now.first
        val y = now.second
        val add = map[y][x]

        if (x == n - 1 && y == n - 1) {
            result = "HaruHaru"
            return
        }

        if (x + add in 0 until n && !visit[y][x + add]) {
            queue.add(Pair(x + add, y))
            visit[y][x + add] = true
        }

        if (y + add in 0 until n && !visit[y + add][x]) {
            queue.add(Pair(x, y + add))
            visit[y + add][x] = true
        }
    }
}