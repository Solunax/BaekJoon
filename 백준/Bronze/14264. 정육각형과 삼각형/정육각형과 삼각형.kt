import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toDouble()
    bw.write("${(sqrt(3.0) / 4) * n.pow(2)}")

    bw.close()
    br.close()
}