import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.floor
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (d, h, w) = br.readLine().split(" ").map{ it.toDouble() }

    val value = sqrt((d*d) / (h*h + w*w))
    bw.write("%.0f %.0f".format(floor(value*h), floor(value*w)))

    bw.close()
    br.close()
}