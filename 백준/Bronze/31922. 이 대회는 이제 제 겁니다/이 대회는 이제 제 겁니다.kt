import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, p, c) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${max(a + c, p)}")

    bw.close()
    br.close()
}