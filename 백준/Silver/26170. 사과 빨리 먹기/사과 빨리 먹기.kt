import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var findResult = false
var result = Int.MAX_VALUE
val dx = listOf(1, -1, 0, 0)
val dy = listOf(0, 0, 1, -1)

fun main() {
    map = Array(5) { IntArray(5) }
    visit = Array(5) { BooleanArray(5) }

    repeat(5) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    val (y, x) = br.readLine().split(" ").map { it.toInt() }
    visit[y][x] = true
    if (map[y][x] == 1) {
        search(x, y, 1, 0)
    } else {
        search(x, y, 0, 0)
    }

    if (findResult) {
        bw.write("$result")
    } else {
        bw.write("-1")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, eatCount: Int, move: Int) {
    if (eatCount == 3) {
        findResult = true
        result = min(result, move)
        return
    }

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until 5 && ny in 0 until 5
            && map[ny][nx] != -1 && !visit[ny][nx]) {
            visit[ny][nx] = true

            if (map[ny][nx] == 1) {
                search(nx, ny, eatCount + 1, move + 1)
            } else {
                search(nx, ny, eatCount, move + 1)
            }

            visit[ny][nx] = false
        }
    }
}