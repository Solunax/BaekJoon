import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: IntArray
lateinit var visit: BooleanArray
var n = 0
var start = 0
var end = 0

fun main() {
    n = br.readLine().toInt()
    map = IntArray(n + 1)
    val st = StringTokenizer(br.readLine())

    repeat(n) {
        map[it + 1] = st.nextToken().toInt()
    }

    val input = br.readLine().split(" ").map { it.toInt() }
    start = input[0]
    end = input[1]

    visit = BooleanArray(n + 1)
    search()

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Location>()
    queue.add(Location(start, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        val move = map[now.point]

        if (now.point == end) {
            bw.write("${now.count}")
            return
        }

        var next = now.point
        while (true) {
            next += move

            if (next > n) {
                break
            }

            queue.add(Location(next, now.count + 1))
            visit[next] = true
        }

        next = now.point
        while (true) {
            next -= move

            if (next < 1) {
                break
            }

            queue.add(Location(next, now.count + 1))
            visit[next] = true
        }
    }
    bw.write("-1")
}

data class Location(val point: Int, val count: Int)