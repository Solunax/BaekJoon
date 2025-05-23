import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, x, y) = br.readLine().split(" ").map { v -> v.toInt() }
        val car = br.readLine().split(" ").map { v -> v.toDouble() }
        var first = Double.MAX_VALUE

        for (i in 0 until n - 1) {
            first = min(first, x / car[i] * 1.0)
        }

        if (first > x / car.last()) {
            bw.write("0\n")
        } else {
            var start = 0
            var end = y
            while (start <= end) {
                val center = (start + end) / 2

                if ((x - center * 1.0) / car.last() + 1 < first) {
                    end = center - 1
                } else {
                    start = center + 1
                }
            }

            if (start > y) {
                bw.write("-1\n")
            } else {
                bw.write("$start\n")
            }
        }
    }

    bw.close()
    br.close()
}