import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: BooleanArray
var r = 0
var c = 0
var result = 1
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    map = Array(r) { IntArray(c) }
    visit = BooleanArray(26)

    for (y in 0 until r) {
        val str = br.readLine()

        for (x in 0 until c) {
            map[y][x] = str[x] - 'A'
        }
    }

    search(0, 0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, count: Int) {
    if (visit[map[y][x]]) {
        result = max(result, count)
        return
    }

    visit[map[y][x]] = true

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until c && ny in 0 until r) {
            search(nx, ny, count + 1)
        }
    }

    visit[map[y][x]] = false
}