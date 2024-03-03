import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y) = br.readLine().split(" ").map { it.toLong() }
    val z = getPercentage(x, y)
    var start = 0
    var end = 1000000000
    var result = -1

    while (start <= end) {
        val center = (start + end) / 2

        if (getPercentage(x + center, y + center) > z) {
            result = center
            end = center - 1
        } else {
            start = center + 1
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun getPercentage(x: Long, y: Long): Long {
    return y * 100 / x
}