import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val level = LongArray(n)
    var start = Int.MAX_VALUE.toLong()
    var end = Int.MAX_VALUE.toLong()

    repeat(n) {
        level[it] = br.readLine().toLong()
        start = min(start, level[it])
    }

    var result = 0L
    while (start <= end) {
        val center = (start + end) / 2
        var sum = 0L

        for (i in 0 until n) {
            if (level[i] < center) {
                sum += (center - level[i])
            }
        }

        if (sum <= k) {
            result = max(result, center)
            start = center + 1
        } else {
            end = center - 1
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}