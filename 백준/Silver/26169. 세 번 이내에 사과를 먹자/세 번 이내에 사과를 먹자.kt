import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var map = Array(5) { IntArray(5) }
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var result = false

fun main() {
    repeat(5) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    search(c, r, 0, 0)

    if (result) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int, apple: Int, move: Int) {
    if (move == 3) {
        if (apple >= 2) {
            result = true
        }

        return
    }

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until 5 && ny in 0 until 5
            && map[ny][nx] != -1
        ) {
            if (map[ny][nx] == 1) {
                map[y][x] = -1
                search(nx, ny, apple + 1, move + 1)
            } else {
                map[y][x] = -1
                search(nx, ny, apple, move + 1)
            }
            map[y][x] = 0
        }
    }
}