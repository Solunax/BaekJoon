import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
const val MAX = 100000000

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n + 1) { IntArray(n + 1) { MAX } }

    repeat(m) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        map[v1][v2] = 1
        map[v2][v1] = 1
    }

    for (k in 1..n) {
        for (i in 1..n) {
            for (j in 1..n) {
                map[i][j] = min(map[i][j], map[i][k] + map[k][j])
            }
        }
    }

    var result = true

    for (y in 1..n) {
        for (x in 1..n) {
            if (map[y][x] > 6) {
                result = false
            }
        }
    }

    if (result) {
        bw.write("Small World!")
    } else {
        bw.write("Big World!")
    }

    bw.close()
    br.close()
}