import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var r = 0
var c = 0
var k = 0
lateinit var map: Array<CharArray>
lateinit var visit: Array<Array<Boolean>>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var count = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    k = input[2]
    map = Array(r) { CharArray(c) }
    visit = Array(r) { Array(c) { false } }
    visit[r - 1][0] = true

    repeat(r) {
        map[it] = br.readLine().toCharArray()
    }

    getRoute(0, r - 1, 1)
    bw.write("$count")

    bw.close()
    br.close()
}

fun getRoute(x: Int, y: Int, move: Int) {
    if (x == c - 1 && y == 0) {
        if (move == k) {
            count++
        }

        return
    }

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until c && ny in 0 until r) {
            if (map[ny][nx] != 'T' && !visit[ny][nx]) {
                visit[ny][nx] = true
                getRoute(nx, ny, move + 1)
                visit[ny][nx] = false
            }
        }
    }
}