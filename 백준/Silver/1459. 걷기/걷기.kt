import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y, w, s) = br.readLine().split(" ").map { it.toLong() }

    val v1 = (x + y) * w
    val v2 = if ((x + y) % 2 == 0L) {
        max(x, y) * s
    } else {
        (max(x, y) - 1) * s + w
    }
    val v3 = (min(x, y) * s) + (abs(x - y) * w)

    bw.write("${minOf(v1, v2, v3)}")

    bw.close()
    br.close()
}