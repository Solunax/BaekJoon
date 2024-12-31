import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
lateinit var map: Array<List<Int>>
lateinit var visit: Array<BooleanArray>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var result = Int.MAX_VALUE

fun main() {
    n = br.readLine().toInt()
    map = Array(n + 1) { List(n + 1) { 0 } }
    visit = Array(n + 1) { BooleanArray(n + 1) }

    repeat(n) {
        map[it + 1] = listOf(0) + br.readLine().split(" ").map { v -> v.toInt() }
    }

    search(0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(count: Int, sum: Int) {
    if (count == 3) {
        result = min(result, sum)
    } else {
        for (y in 2 until n) {
            for (x in 2 until n) {
                if (!visit[y][x] && placeCheck(x, y)) {
                    visit[y][x] = true
                    search(count + 1, sum + getCost(x, y))

                    clearVisit(x, y)
                }
            }
        }
    }
}

fun placeCheck(x: Int, y: Int): Boolean {
    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (visit[ny][nx]) {
            return false
        }
    }

    return true
}

fun getCost(x: Int, y: Int): Int {
    var total = map[y][x]

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        visit[ny][nx] = true
        total += map[ny][nx]
    }

    return total
}

fun clearVisit(x: Int, y: Int) {
    visit[y][x] = false

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        visit[ny][nx] = false
    }
}