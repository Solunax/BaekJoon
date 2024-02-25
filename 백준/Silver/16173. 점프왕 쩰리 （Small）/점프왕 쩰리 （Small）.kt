import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Array<Int>>
lateinit var visit: Array<Array<Boolean>>
var check = false
var n = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(n + 1) { Array(n + 1) { 0 } }
    visit = Array(n + 1) { Array(n + 1) { false } }

    repeat(n) { i ->
        val input = br.readLine().split(" ").map { it.toInt() }

        for (j in input.indices) {
            map[i + 1][j + 1] = input[j]
        }
    }

    search(1, 1, map[1][1])

    if (check) {
        bw.write("HaruHaru")
    } else {
        bw.write("Hing")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, distance: Int) {
    if (map[y][x] == -1) {
        check = true
        return
    }

    visit[y][x] = true
    val nx = x + distance
    val ny = y + distance

    if (nx in 1..n) {
        if (!visit[y][nx]) {
            search(nx, y, map[y][nx])
        }
    }

    if (ny in 1..n) {
        if (!visit[ny][x]) {
            search(x, ny, map[ny][x])
        }
    }

    visit[y][x] = false
}