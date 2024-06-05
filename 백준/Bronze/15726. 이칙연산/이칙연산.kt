import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toDouble() }
    bw.write("${max(a * b / c, a / b * c).toInt()}")

    bw.close()
    br.close()
}