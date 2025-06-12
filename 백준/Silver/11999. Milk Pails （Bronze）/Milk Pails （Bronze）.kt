import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y, m) = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    for (i in 0..1000) {
        for (j in 0..1000) {
            if (x * i + y * j <= m) {
                result = max(result, x * i + y * j)
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}