import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toDouble() }
    val (na, nb, nc) = br.readLine().split(" ").map { it.toDouble() }
    val v1 = a / na
    val v2 = b / nb
    val v3 = c / nc
    val minValue = minOf(v1, v2, v3)

    bw.write("%.6f %.6f %.6f"
        .format(a - minValue * na, b - minValue * nb, c - minValue * nc))

    bw.close()
    br.close()
}