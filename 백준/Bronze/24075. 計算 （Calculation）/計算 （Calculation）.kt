import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n1, n2) = br.readLine().split(" ").map { it.toInt() }
    val r1 = n1 + n2
    val r2 = n1 - n2

    bw.write("${max(r1, r2)}\n${min(r1, r2)}")

    bw.close()
    br.close()
}