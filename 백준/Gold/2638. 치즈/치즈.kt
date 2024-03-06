import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Array<Int>>
val cheeseLocation = ArrayList<Pair<Int, Int>>()
var cheeseCount = 0
var n = 0
var m = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n) { Array(m) { 0 } }

    repeat(n) { i ->
        map[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

        for (j in 0 until m) {
            if (map[i][j] == 1) {
                cheeseCount++
                cheeseLocation.add(Pair(j, i))
            }
        }
    }

    var time = 0
    while (cheeseCount != 0) {
        time++
        airCheck()
        meltingCheese()
    }
    bw.write("$time")

    bw.close()
    br.close()
}

fun meltingCheese() {
    var index = 0
    while (index < cheeseLocation.size) {
        val x = cheeseLocation[index].first
        val y = cheeseLocation[index].second
        var airCount = 0

        repeat(4) {
            val nx = x + dx[it]
            val ny = y + dy[it]

            if (map[ny][nx] == 2) {
                airCount++
            }
        }

        if (airCount >= 2) {
            map[y][x] = 0
            cheeseCount--
            cheeseLocation.removeAt(index)
            index--
        }

        index++
    }
}

fun airCheck() {
    val queue = LinkedList<Pair<Int, Int>>()
    val visit = Array(n) { Array(m) { false } }
    queue.add(Pair(0, 0))
    map[0][0] = 2
    visit[0][0] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until m && ny in 0 until n
                && !visit[ny][nx] && map[ny][nx] != 1
            ) {
                map[ny][nx] = 2
                queue.add(Pair(nx, ny))
                visit[ny][nx] = true
            }
        }
    }
}