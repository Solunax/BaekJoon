import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    if (a == 0) {
        bw.write("${c * c - b}")
    } else if (b == 0) {
        bw.write("${c * c - a}")
    } else {
        bw.write("${sqrt((a + b).toDouble()).toInt()}")
    }

    bw.close()
    br.close()
}