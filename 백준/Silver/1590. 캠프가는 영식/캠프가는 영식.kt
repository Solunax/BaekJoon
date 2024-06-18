import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, t) = br.readLine().split(" ").map { it.toInt() }
    var result = Int.MAX_VALUE

    repeat(n) {
        val (start, interval, count) = br.readLine().split(" ").map { it.toInt() }

        if (start >= t) {
            result = min(result, start - t)
        } else {
            var time = start
            for (i in 0 until count) {
                if (time >= t) {
                    result = min(result, time - t)
                    break
                }
                time += interval
            }
        }
    }

    if (result == Int.MAX_VALUE) {
        bw.write("-1")
    } else {
        bw.write("$result")
    }

    bw.close()
    br.close()
}