import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, x ,y) = br.readLine().split(" ").map{ it.toInt() }

    val v1 = abs(a - b)
    val v2 = abs(a - x) + abs(b - y)
    val v3 = abs(b - x) + abs(a - y)

    bw.write("${min(v1, min(v2, v3))}")

    bw.close()
    br.close()
}