import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s, a) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${min(s / 2, a / 2)}")

    bw.close()
    br.close()
}