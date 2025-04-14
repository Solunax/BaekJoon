import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, h, v) = br.readLine().split(" ").map { it.toLong() }
    bw.write("${max(h, n - h) * max(v, n - v) * 4}")

    bw.close()
    br.close()
}
