import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val k = br.readLine().toDouble()
    val (d1, d2) = br.readLine().split(" ").map { it.toDouble() }

    bw.write("${k.pow(2) - (abs(d1 - d2) / 2).pow(2)}")

    bw.close()
    br.close()
}