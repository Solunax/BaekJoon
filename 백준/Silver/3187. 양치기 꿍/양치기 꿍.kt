import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
var r = 0
var c = 0
var sheep = 0
var wolf = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]

    map = Array(r) { CharArray(c) }
    visit = Array(r) { BooleanArray(c) }

    repeat(r) { idx ->
        val line = br.readLine().toCharArray()
        map[idx] = line
        sheep += line.count { it == 'k' }
        wolf += line.count { it == 'v' }
    }

    for (y in 0 until r) {
        for (x in 0 until c) {
            if (map[y][x] != '.' && map[y][x] != '#' && !visit[y][x]) {
                search(x, y)
            }
        }
    }

    bw.write("$sheep $wolf")

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    var sheepCount = 0
    var wolfCount = 0
    val queue = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        when (map[now.second][now.first]) {
            'k' -> sheepCount++
            'v' -> wolfCount++
        }

        repeat(4) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until c && ny in 0 until r) {
                if (!visit[ny][nx] && map[ny][nx] != '#') {
                    queue.add(Pair(nx, ny))
                    visit[ny][nx] = true
                }
            }
        }
    }

    if (sheepCount > wolfCount) {
        wolf -= wolfCount
    } else {
        sheep -= sheepCount
    }
}