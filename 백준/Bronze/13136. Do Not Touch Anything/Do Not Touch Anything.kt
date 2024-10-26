import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c, n) = br.readLine().split(" ").map { it.toDouble() }
    val nr = ceil(r / n).toLong()
    val nc = ceil(c / n).toLong()
    
    bw.write("${nr * nc}")

    bw.close()
    br.close()
}
