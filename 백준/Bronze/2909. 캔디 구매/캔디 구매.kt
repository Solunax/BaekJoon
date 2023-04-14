import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.roundToInt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, c) = br.readLine().split(" ").map { it.toDouble() }
    val temp = 10.0.pow(c)

    bw.write("${((n / temp).roundToInt() * temp).toInt()}")

    bw.close()
    br.close()
}