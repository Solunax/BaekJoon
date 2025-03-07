import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val result = ArrayList<String>()
lateinit var map: Array<CharArray>
lateinit var visit: Array<Array<BooleanArray>>
var r = 0
var c = 0
val dx = listOf(1, 0)
val dy = listOf(0, 1)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    map = Array(r) { CharArray(c) }
    visit = Array(r) { Array(c) { BooleanArray(2) } }

    repeat(r) {
        map[it] = br.readLine().toCharArray()
    }

    for (y in 0 until r) {
        for (x in 0 until c) {
            if (map[y][x] != '#') {
                repeat(2) { t ->
                    if (!visit[y][x][t]) {
                        findWord(x, y, t)
                    }
                }
            }
        }
    }
    bw.write(result.sorted()[0])

    bw.close()
    br.close()
}

fun findWord(x: Int, y: Int, t: Int) {
    val str = StringBuilder()
    visit[y][x][t] = true
    str.append(map[y][x])

    var nx = x + dx[t]
    var ny = y + dy[t]

    while (nx < c && ny < r && map[ny][nx] != '#') {
        visit[ny][nx][t] = true
        str.append(map[ny][nx])
        nx += dx[t]
        ny += dy[t]
    }

    if (str.length >= 2) {
        result.add(str.toString())
    }
}