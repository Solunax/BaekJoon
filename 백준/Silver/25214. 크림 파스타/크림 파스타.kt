import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    var minValue = Int.MAX_VALUE
    var result = 0

    repeat(n) {
        val now = arr[it]

        if (minValue > now) {
            minValue = now
        } else {
            result = max(result, now - minValue)
        }

        bw.write("$result ")
    }

    bw.close()
    br.close()
}