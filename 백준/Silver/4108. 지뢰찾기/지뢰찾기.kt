import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(-1, 0, 1, -1, 1, -1, 0, 1)
val dy = listOf(1, 1, 1, 0, 0, -1, -1, -1)
lateinit var map: Array<CharArray>
var r = 0
var c = 0

fun main() {
    while (true) {
        val input = br.readLine().split(" ").map { it.toInt() }
        if (input[0] == 0 && input[1] == 0) {
            break
        }

        r = input[0]
        c = input[1]
        map = Array(r) { CharArray(c) }

        repeat(r) {
            map[it] = br.readLine().toCharArray()
        }

        for (y in 0 until r) {
            for (x in 0 until c) {
                if (map[y][x] == '*') {
                    bw.write("*")
                } else {
                    bw.write("${findMines(x, y)}")
                }
            }
            bw.write("\n")
        }
    }

    bw.close()
    br.close()
}

fun findMines(x: Int, y: Int): Int {
    var mine = 0

    repeat(8) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until c && ny in 0 until r && map[ny][nx] == '*') {
            mine++
        }
    }

    return mine
}