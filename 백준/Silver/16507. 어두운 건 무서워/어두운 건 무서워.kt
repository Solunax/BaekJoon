import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c, q) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(r + 1) { IntArray(c + 1) }

    for (i in 1..r) {
        val st = StringTokenizer(br.readLine())
        for (j in 1..c) {
            map[i][j] = map[i][j - 1] + map[i - 1][j] + st.nextToken().toInt() - map[i - 1][j - 1]
        }
    }

    repeat(q) {
        val (r1, c1, r2, c2) = br.readLine().split(" ").map { it.toInt() }
        val sum = map[r2][c2] - map[r1 - 1][c2] - map[r2][c1 - 1] + map[r1 - 1][c1 - 1]
        bw.write("${sum / ((r2 - r1 + 1) * (c2 - c1 + 1))}\n")
    }

    bw.close()
    br.close()
}