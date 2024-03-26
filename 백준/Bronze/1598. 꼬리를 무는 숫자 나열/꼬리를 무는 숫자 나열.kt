import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toInt() - 1 }
    val v1 = abs((a / 4) - (b / 4))
    val v2 = abs((a % 4) - (b % 4))

    bw.write("${v1 + v2}")

    bw.close()
    br.close()
}