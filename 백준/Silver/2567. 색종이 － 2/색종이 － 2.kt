import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    val map = Array(101) { Array(101) { 0 } }
    val n = br.readLine().toInt()
    var result = 0

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        for (i in x until x + 10) {
            for (j in y until y + 10) {
                map[i][j] = 1
            }
        }
    }

    for (y in 1..100) {
        for (x in 1..100) {
            if (map[y][x] == 1) {
                repeat(4) {
                    val nx = x + dx[it]
                    val ny = y + dy[it]

                    if (nx in 1..100 && ny in 1..100 && map[ny][nx] == 0) {
                        result++
                    } else if (nx < 1 || nx > 100 || ny < 1 || ny > 100) {
                        result++
                    }
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}