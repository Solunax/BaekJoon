import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (c4, a3, a4) = br.readLine().split(" ").map { it.toDouble() }
    bw.write("%.6f".format(((c4 * 2 * 229 * 324) + (a3 * 2 * 297 * 420) + (a4 * 210 * 297)) * 0.000001))

    bw.close()
    br.close()
}