import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val pos = Array(4) { Pair(0.0, 0.0) }
val visit = BooleanArray(4)
var result = Double.MAX_VALUE

fun main() {
    repeat(4) {
        val (x, y) = br.readLine().split(" ").map { v -> v.toDouble() }
        pos[it] = Pair(x, y)
    }
    
    search(0, 0.0, 0)
    bw.write("${result.toInt()}")

    bw.close()
    br.close()
}

fun search(now: Int, cost: Double, d: Int) {
    if (d == 3) {
        result = min(result, cost)
        return
    }

    for (i in 1..3) {
        if (!visit[i]) {
            visit[i] = true
            search(i, cost + getDistance(now, i), d + 1)
            visit[i] = false
        }
    }
}

fun getDistance(a: Int, b: Int): Double {
    return sqrt((pos[a].first - pos[b].first).pow(2) + (pos[a].second - pos[b].second).pow(2))
}