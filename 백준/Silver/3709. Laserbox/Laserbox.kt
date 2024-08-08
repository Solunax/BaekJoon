import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<BooleanArray>
var n = 0
var resultX = 0
var resultY = 0
val dx = listOf(-1, 0, 1, 0)
val dy = listOf(0, 1, 0, -1)

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toInt() }
        n = input[0]
        map = Array(n + 2) { BooleanArray(n + 2) }

        repeat(input[1]) {
            val (x, y) = br.readLine().split(" ").map { it.toInt() }
            map[x][y] = true
        }

        val (lx, ly) = br.readLine().split(" ").map { it.toInt() }
        val dir = if (lx == 0) {
            2
        } else if (lx == n + 1) {
            0
        } else if (ly == 0) {
            1
        } else {
            3
        }

        search(lx, ly, dir, 0)

        bw.write("$resultX $resultY\n")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, dir: Int, turn: Int) {
    if (turn > n * n) {
        return
    }

    val nx = x + dx[dir]
    val ny = y + dy[dir]

    if (nx !in 1..n || ny !in 1..n) {
        resultX = nx
        resultY = ny
        return
    }

    if (!map[nx][ny]) {
        search(nx, ny, dir, turn)
    } else {
        search(nx, ny, (dir + 1) % 4, turn + 1)
    }
}