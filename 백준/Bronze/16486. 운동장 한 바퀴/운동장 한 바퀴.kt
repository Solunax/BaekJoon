import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val d1 = br.readLine().toDouble() * 2
    val d2 = br.readLine().toDouble() * 3.141592 * 2

    bw.write("%.6f".format(d1 + d2))

    bw.close()
    br.close()
}