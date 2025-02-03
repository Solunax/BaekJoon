import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { List(n) { 0 } }
    val dx = listOf(0, 0, 1, -1)
    val dy = listOf(1, -1, 0, 0)
    var sum = n * m * 2

    repeat(n) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            for (k in 0 until 4) {
                val nx = i + dx[k]
                val ny = j + dy[k]

                if (nx !in 0 until n || ny !in 0 until m) {
                    sum += map[i][j]
                    continue
                }

                if (map[nx][ny] < map[i][j]) {
                    sum += map[i][j] - map[nx][ny]
                }
            }
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}