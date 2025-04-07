import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = Array(501) { BooleanArray(501) }
    var result = 0

    repeat(n) {
        val (x1, y1, x2, y2) = br.readLine().split(" ").map { it.toInt() }

        for (y in y1 until y2) {
            for (x in x1 until x2) {
                if (!map[y][x]) {
                    map[y][x] = true
                    result++
                }
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}