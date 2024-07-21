import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<List<Int>>
lateinit var visit: Array<BooleanArray>
var n = 0
var m = 0
var jump = 0

fun main() {
    n = br.readLine().toInt()
    m = br.readLine().toInt()
    map = Array(n) { List(m) { 0 } }
    visit = Array(n) { BooleanArray(m) }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }
    jump = br.readLine().toInt()

    if (search()) {
        bw.write("ALIVE")
    } else {
        bw.write("DEAD")
    }

    bw.close()
    br.close()
}

fun search(): Boolean {
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(0, 0))
    visit[0][0] = true

    while (queue.isNotEmpty()) {
        val (nowX, nowY) = queue.poll()

        if (nowX == m - 1 && nowY == n - 1) {
            return true
        }

        for (i in -jump..jump) {
            for (j in -jump..jump) {
                val nx = nowX + j
                val ny = nowY + i

                if (nx in 0 until m && ny in 0 until n
                    && abs(nx - nowX) + abs(ny - nowY) <= jump
                    && map[nowY][nowX] == map[ny][nx]
                    && !visit[ny][nx]) {
                    queue.add(Pair(nx, ny))
                    visit[ny][nx] = true
                }
            }
        }
    }

    return false
}