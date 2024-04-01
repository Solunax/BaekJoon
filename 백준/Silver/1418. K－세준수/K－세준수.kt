import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val k = br.readLine().toInt()
    var result = 0

    for (i in 1..n) {
        var now = i
        var maxValue = 0
        var index = 2
        while (index <= sqrt(n.toDouble()).toInt()) {
            if (now % index == 0) {
                now /= index
                maxValue = index
            } else {
                index++
            }
        }

        if (now != 1) {
            maxValue = now
        }

        if (maxValue <= k) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}