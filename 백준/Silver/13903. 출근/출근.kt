import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<IntArray>
lateinit var visit: Array<BooleanArray>
var r = 0
var c = 0
var moveCount = 0
var rule = ArrayList<Pair<Int, Int>>()
val queue = LinkedList<MoveData>()
var result = Int.MAX_VALUE

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    map = Array(r) { IntArray(c) }
    visit = Array(r) { BooleanArray(c) }

    repeat(r) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    moveCount = br.readLine().toInt()

    repeat(moveCount) {
        val (mr, mc) = br.readLine().split(" ").map { it.toInt() }
        rule.add(Pair(mr, mc))
    }

    for (x in 0 until c) {
        if (map[0][x] == 1) {
            queue.add(MoveData(x, 0, 0))
            visit[0][x] = true
        }
    }
    search()

    if (result == Int.MAX_VALUE) {
        bw.write("-1")
    } else {
        bw.write("$result")
    }

    bw.close()
    br.close()
}

fun search() {
    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (now.y == r - 1) {
            result = min(result, now.count)
            return
        }

        repeat(moveCount) { i ->
            val nx = now.x + rule[i].second
            val ny = now.y + rule[i].first

            if (nx in 0 until c && ny in 0 until r
                && !visit[ny][nx] && map[ny][nx] == 1) {
                queue.add(MoveData(nx, ny, now.count + 1))
                visit[ny][nx] = true
            }
        }
    }
}

data class MoveData(val x: Int, val y: Int, val count: Int)