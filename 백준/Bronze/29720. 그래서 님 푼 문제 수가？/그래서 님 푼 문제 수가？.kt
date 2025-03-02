import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }
    val minValue = max(n - (m * k), 0)
    val maxValue = n - m * (k - 1) - 1

    bw.write("$minValue $maxValue")

    bw.close()
    br.close()
}
