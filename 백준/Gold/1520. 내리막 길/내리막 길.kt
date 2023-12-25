import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
lateinit var map: Array<Array<Int>>
lateinit var dp: Array<Array<Int>>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[1]
    m = input[0]
    map = Array(m + 1) { Array(n + 1) { 0 } }
    dp = Array(m + 1) { Array(n + 1) { -1 } }

    repeat(m) {
        map[it + 1] = (listOf(0) + br.readLine().split(" ").map { v -> v.toInt() }).toTypedArray()
    }
    bw.write("${search(1, 1)}")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int): Int {
    if (x == m && y == n) {
        return 1
    }

    if (dp[x][y] != -1) {
        return dp[x][y]
    }

    dp[x][y] = 0
    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 1..m && ny in 1..n) {
            if (map[x][y] > map[nx][ny]) {
                dp[x][y] += search(nx, ny)
            }
        }
    }

    return dp[x][y]
}