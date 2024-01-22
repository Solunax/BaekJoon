import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine().split(" ") .map { it.toInt() }
    var result = 0
    var minValue = Int.MAX_VALUE

    for (i in input) {
        result = max(result, i - minValue)
        minValue = min(minValue, i)
    }
    bw.write("$result")

    bw.close()
    br.close()
}