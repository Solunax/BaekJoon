import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toDouble()
    bw.write("${(1 + 2.0.pow(n)).pow(2).toInt()}")

    bw.close()
    br.close()
}