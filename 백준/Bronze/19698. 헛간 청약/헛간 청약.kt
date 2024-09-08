import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, w, h, l) = br.readLine().split(" ").map { it.toInt() }
    val s = (w / l) * (h / l)

    if (n > s) {
        bw.write("$s")
    } else {
        bw.write("$n")
    }

    bw.close()
    br.close()
}