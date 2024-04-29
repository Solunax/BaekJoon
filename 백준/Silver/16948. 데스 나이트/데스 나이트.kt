import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var visit: Array<BooleanArray>
var n = 0
var r1 = 0
var c1 = 0
var r2 = 0
var c2 = 0
val dr = listOf(-2, -2, 0, 0, 2, 2)
val dc = listOf(-1, 1, -2, 2, -1, 1)

fun main() {
    n = br.readLine().toInt()
    visit = Array(n) { BooleanArray(n) }
    val input = br.readLine().split(" ").map { it.toInt() }

    r1 = input[0]
    c1 = input[1]
    r2 = input[2]
    c2 = input[3]

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search(): Int {
    val queue = LinkedList<Location>()
    queue.add(Location(r1, c1, 0))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.r == r2 && now.c == c2) {
            return now.move
        }

        repeat(6) {
            val nr = now.r + dr[it]
            val nc = now.c + dc[it]

            if (nr in 0 until n && nc in 0 until n && !visit[nr][nc]) {
                visit[nr][nc] = true
                queue.add(Location(nr, nc, now.move + 1))
            }
        }

    }

    return -1
}

data class Location(val r: Int, val c: Int, val move: Int)