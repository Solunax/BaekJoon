import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    val n = br.readLine().toInt()

    if (arr.contains(n)) {
        bw.write("0")
    } else {
        var start = 0
        var end = 1001
        var result = 0

        for (i in arr) {
            if (i < n) {
                start = max(start, i)
            } else if (i > n) {
                end = min(end, i)
            }
        }

        for (i in start + 1..n) {
            for (j in n until end) {
                if (i != j) {
                    result++
                }
            }
        }

        bw.write("$result")
    }

    bw.close()
    br.close()
}