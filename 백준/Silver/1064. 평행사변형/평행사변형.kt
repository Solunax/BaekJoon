import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val point = br.readLine().split(" ").map { it.toDouble() }

    if (
        ((point[2] - point[0]) * (point[5] - point[1]))
        == ((point[4] - point[0]) * (point[3] - point[1]))
    ) {
        bw.write("-1")
    } else {
        val ab = getLength(point[0], point[1], point[2], point[3])
        val bc = getLength(point[2], point[3], point[4], point[5])
        val ac = getLength(point[0], point[1], point[4], point[5])

        val maxValue = maxOf(ab, bc, ac)
        val minValue = minOf(ab, bc, ac)

        bw.write("${(maxValue - minValue) * 2}")
    }

    bw.close()
    br.close()
}

fun getLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    return sqrt((x1 - x2).pow(2) + (y1 - y2).pow(2))
}