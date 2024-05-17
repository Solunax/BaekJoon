import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var cost: Array<IntArray>
var n = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    var index = 1
    while (true) {
        n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        map = Array(n) { IntArray(n) }

        repeat(n) {
            map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
        }

        val cost = search()
        bw.write("Problem ${index++}: $cost\n")
    }

    bw.close()
    br.close()
}

fun search(): Int {
    val queue = PriorityQueue<Location>()
    cost = Array(n) { IntArray(n) { Int.MAX_VALUE } }
    queue.add(Location(0, 0, map[0][0]))
    cost[0][0] = map[0][0]

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.x == n - 1 && now.y == n - 1) {
            return now.cost
        }

        repeat(4) {
            val nx = now.x + dx[it]
            val ny = now.y + dy[it]

            if (nx in 0 until n && ny in 0 until n) {
                if (now.cost + map[ny][nx] < cost[ny][nx]) {
                    cost[ny][nx] = now.cost + map[ny][nx]
                    queue.add(Location(nx, ny, now.cost + map[ny][nx]))
                }
            }
        }
    }

    return -1
}

data class Location(val x: Int, val y: Int, val cost: Int) : Comparable<Location> {
    override fun compareTo(other: Location): Int {
        return this.cost - other.cost
    }
}