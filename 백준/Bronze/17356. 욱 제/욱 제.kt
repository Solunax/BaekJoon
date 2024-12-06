import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toDouble() }
    bw.write("%.6f".format(1 / (1 + 10.0.pow((b - a) / 400))))

    bw.close()
    br.close()
}