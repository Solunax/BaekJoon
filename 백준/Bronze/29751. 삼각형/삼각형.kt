import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h) = br.readLine().split(" ").map { it.toDouble() }
    bw.write("%.1f".format(w * h / 2))

    bw.close()
    br.close()
}