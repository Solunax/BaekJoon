import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<List<Int>>
lateinit var dp: Array<Array<Int>>
var n = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { List(n) { 0 } }
    dp = Array(n) { Array(n) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    var result = 0
    for (i in 0 until n) {
        for (j in 0 until n) {
            result = max(result, search(i, j))
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int): Int {
    if (dp[x][y] != 0) {
        return dp[x][y]
    }

    dp[x][y] = 1

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until n && ny in 0 until n
            && map[x][y] < map[nx][ny]
        ) {
            dp[x][y] = max(dp[x][y], search(nx, ny) + 1)
        }
    }

    return dp[x][y]
}