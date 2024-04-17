import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: IntArray
var n = 0
var s = 0
var d = 0
var k = 0
val move = IntArray(2)
lateinit var visit: BooleanArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    s = input[1]
    d = input[2]
    move[0] = input[3]
    move[1] = -(input[4])
    k = input[5]
    map = IntArray(n + 1)
    visit = BooleanArray(n + 1)

    if (k > 0) {
        br.readLine().split(" ").map { it.toInt() }.forEach {
            visit[it] = true
        }
    }

    val result = search(s)

    if (result != Int.MAX_VALUE) {
        bw.write("$result")
    } else {
        bw.write("BUG FOUND")
    }

    bw.close()
    br.close()
}

fun search(idx: Int): Int {
    val queue = LinkedList<Location>()
    queue.add(Location(idx, 0))
    visit[idx] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.location == d) {
            return now.move
        }

        repeat(2) {
            val next = now.location + move[it]

            if (next in 1..n && !visit[next]) {
                visit[next] = true
                queue.add(Location(next, now.move + 1))
            }
        }
    }

    return Int.MAX_VALUE
}

data class Location(val location: Int, val move: Int)