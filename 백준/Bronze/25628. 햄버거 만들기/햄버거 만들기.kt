import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (b, p) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${min(b / 2, p)}")

    bw.close()
    br.close()
}