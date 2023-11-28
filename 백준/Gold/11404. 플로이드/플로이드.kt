import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = 10000000
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val map = Array(n + 1){ Array(n + 1){num} }

    repeat(m) {
        val (v1, v2, cost) = br.readLine().split(" ").map { it.toInt() }
        map[v1][v2] = min(map[v1][v2], cost)
    }

    for(k in 1 .. n) {
        for (i in 1 .. n) {
            for (j in 1 .. n) {
                map[i][j] = min(map[i][j], map[i][k] + map[k][j])
            }
        }
    }

    for (i in 1 .. n) {
        for (j in 1 .. n) {
            if (map[i][j] == num || i == j) {
                bw.write("0 ")
            } else {
                bw.write("${map[i][j]} ")
            }
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}