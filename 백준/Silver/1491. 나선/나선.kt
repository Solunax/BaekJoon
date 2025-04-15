import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val visit = Array(m) { BooleanArray(n) }
    visit[0][0] = true
    var move = 1
    var d = 1
    var x = 0
    var y = 0

    while (move < n * m) {
        if (d > 4) {
            d = 1
        }

        when (d) {
            1 -> {
                if (x + 1 < n && !visit[y][x + 1]) {
                    x++
                    visit[y][x] = true
                    move++
                } else {
                    d++
                }
            }
            2 -> {
                if (y + 1 < m && !visit[y + 1][x]) {
                    y++
                    visit[y][x] = true
                    move++
                } else {
                    d++
                }
            }
            3 -> {
                if (x - 1 >= 0 && !visit[y][x - 1]) {
                    x--
                    visit[y][x] = true
                    move++
                } else {
                    d++
                }
            }
            4 -> {
                if (y - 1 >= 0 && !visit[y - 1][x]) {
                    y--
                    visit[y][x] = true
                    move++
                } else {
                    d++
                }
            }
        }
    }
    bw.write("$x $y")

    bw.close()
    br.close()
}