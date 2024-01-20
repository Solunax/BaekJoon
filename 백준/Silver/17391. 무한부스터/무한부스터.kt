import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
val dx = listOf(0, 1)
val dy = listOf(1, 0)
lateinit var map : Array<List<Int>>
lateinit var visit : Array<Array<Boolean>>

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n){List(m){0} }
    visit = Array(n){Array(m){false} }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search() : Int {
    val queue = LinkedList<Pair<Int, Int>>()
    var time = 0
    queue.add(Pair(0, 0))

    while (queue.isNotEmpty()) {
        val size = queue.size

        repeat(size) {
            val now = queue.poll()
            val x = now.first
            val y = now.second

            if (x == n -1 && y == m - 1) {
                return time
            }

            val booster = map[x][y]
            for (i in 0 until 2) {
                for (j in 1 .. booster) {
                    val nx = x + j * dx[i]
                    val ny = y + j * dy[i]

                    if (nx < n && ny < m && !visit[nx][ny]) {
                        visit[nx][ny] = true
                        queue.add(Pair(nx, ny))
                    }
                }
            }
        }
        time++
    }

    return -1
}