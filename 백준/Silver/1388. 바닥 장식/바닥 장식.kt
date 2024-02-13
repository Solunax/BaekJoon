import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var tile: Array<List<String>>
lateinit var visit: Array<Array<Boolean>>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    var result = 0
    n = input[0]
    m = input[1]
    tile = Array(n) { List(m) { "" } }
    visit = Array(n) { Array(m) { true } }

    repeat(n) {
        tile[it] = br.readLine().split("").filter { v -> v.isNotEmpty() }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (visit[i][j]) {
                result++
                search(j, i)
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    visit[y][x] = false

    if (tile[y][x] == "-") {
        if (x + 1 in 0 until m) {
            if (tile[y][x] == tile[y][x + 1]) {
                search(x + 1, y)
            }
        }
    } else {
        if (y + 1 in 0 until n) {
            if (tile[y][x] == tile[y + 1][x]) {
                search(x, y + 1)
            }
        }
    }
}