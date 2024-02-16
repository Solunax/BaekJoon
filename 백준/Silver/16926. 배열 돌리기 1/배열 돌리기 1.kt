import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(1, 0, -1, 0)
val dy = listOf(0, 1, 0, -1)

fun main() {
    val (n, m, r) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n){Array(m){0} }
    val count = min(n, m) / 2

    repeat(n) { i ->
        map[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    }

    repeat(r) {
        repeat(count) { p ->
            val temp = map[p][p]
            var nowX = p
            var nowY = p
            var index = 0

            while (index < 4) {
                val nx = nowX + dx[index]
                val ny = nowY + dy[index]

                if (nx in p until m - p && ny in p until n - p) {
                    map[nowY][nowX] = map[ny][nx]
                    nowX = nx
                    nowY = ny
                } else {
                    index++
                }
            }

            map[p + 1][p] = temp
        }
    }

    map.forEach {
        bw.write("${it.joinToString(" ")}\n")
    }

    bw.close()
    br.close()
}