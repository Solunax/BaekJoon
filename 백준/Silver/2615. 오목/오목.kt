import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = Array(21) { List(21) { 0 } }
val arr = Array(21) { Array(21) { Array(4) { 0 } } }
val dx = listOf(0, 1, 1, 1)
val dy = listOf(1, 1, 0, -1)

fun main() {
    repeat(19) {
        map[it + 1] = listOf(0) + br.readLine().split(" ").map { v -> v.toInt() } + listOf(0)
    }

    bw.write(findGoMok())

    bw.close()
    br.close()
}

fun findGoMok(): String {
    for (x in 1..19) {
        for (y in 1..19) {
            if (map[y][x] != 0) {
                repeat(4) { d ->
                    if (arr[y][x][d] == 0 && search(x, y, d, map[y][x]) == 5) {
                        return "${map[y][x]}\n$y $x"
                    }
                }
            }
        }
    }

    return "0"
}

fun search(x: Int, y: Int, d: Int, stone: Int): Int {
    val nx = x + dx[d]
    val ny = y + dy[d]

    if (map[ny][nx] == stone) {
        arr[ny][nx][d] = search(nx, ny, d, stone) + 1
        return arr[ny][nx][d]
    }

    return 1
}