import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<List<Int>>
lateinit var visit: BooleanArray
var n = 0
var result = Long.MAX_VALUE

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { List(n) { 0 } }

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    repeat(n) { i ->
        visit = BooleanArray(n)
        visit[i] = true
        move(i, i, 0, 0)
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun move(start: Int, now: Int, cost: Long, d: Int) {
    if (d == n - 1) {
        if (map[now][start] != 0) {
            result = min(result, cost + map[now][start])
        }
        return
    }

    for (i in 0 until n) {
        if (!visit[i] && map[now][i] != 0) {
            visit[i] = true
            move(start, i, cost + map[now][i], d + 1)
            visit[i] = false
        }
    }
}