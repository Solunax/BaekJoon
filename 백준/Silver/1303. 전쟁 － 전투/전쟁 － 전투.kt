import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map: Array<List<String>>
lateinit var visit: Array<Array<Boolean>>
var n = 0
var m = 0
var white = 0
var black = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(m) { List(n) { "" } }
    visit = Array(m) { Array(n) { false } }

    repeat(m) {
        map[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }
    }

    for (y in 0 until m) {
        for (x in 0 until n) {
            if (!visit[y][x]) {
                checkPower(x, y)
            }
        }
    }
    bw.write("$white $black")

    bw.close()
    br.close()
}

fun checkPower(x: Int, y: Int) {
    val color = map[y][x]
    var count = 1
    val queue = LinkedList<Pair<Int, Int>>()
    visit[y][x] = true
    queue.add(Pair(x, y))

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until n && ny in 0 until m) {
                if (!visit[ny][nx] && map[ny][nx] == color) {
                    count++
                    visit[ny][nx] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }
    }

    when (map[y][x]) {
        "W" -> white += count * count
        "B" -> black += count * count
    }
}