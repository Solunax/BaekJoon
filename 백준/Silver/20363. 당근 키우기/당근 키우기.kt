import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${x + y + (min(x, y) / 10)}")

    bw.close()
    br.close()
}