import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b) = br.readLine().split(" ").map { it.toDouble() }
    val v1 = -a - sqrt(a * a - b)
    val v2 = -a + sqrt(a * a - b)

    if (v1 == v2) {
        bw.write("${v1.toInt()}")
    } else {
        bw.write("${v1.toInt()} ${v2.toInt()}")
    }

    bw.close()
    br.close()
}
