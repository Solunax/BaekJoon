import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
lateinit var map: Array<List<Int>>
lateinit var visit: Array<Array<Boolean>>
var n = 0
var m = 0
var result = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    map = Array(n) { List(m) { 0 } }
    visit = Array(n) { Array(m) { false } }

    repeat(n) { i ->
        map[i] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (y in 0 until n) {
        for (x in 0 until m) {
            visit[y][x] = true
            search(x, y, 1, map[y][x])
            visit[y][x] = false
            check(x, y)
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, count: Int, sum: Int) {
    if (count == 4) {
        result = max(result, sum)
        return
    }

    repeat(4) { i ->
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in 0 until m && ny in 0 until n) {
            if (!visit[ny][nx]) {
                visit[ny][nx] = true
                search(nx, ny, count + 1, sum + map[ny][nx])
                visit[ny][nx] = false
            }
        }
    }
}

fun check(x: Int, y: Int) {
    if (x < m - 1 && y < n - 2) {
        result = max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x + 1])
    }

    if (x > 0 && y < n - 2) {
        result = max(result, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x - 1])
    }

    if (x < m - 2 && y < n - 1) {
        result = max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y + 1][x + 1])
    }

    if (x < m - 2 && y > 0) {
        result = max(result, map[y][x] + map[y][x + 1] + map[y][x + 2] + map[y - 1][x + 1])
    }
}