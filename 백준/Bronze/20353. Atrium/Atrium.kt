import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val s = br.readLine().toDouble()
    bw.write("%.8f".format(sqrt(s) * 4))

    bw.close()
    br.close()
}