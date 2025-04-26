import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (d, f, p) = br.readLine().split(" ").map { it.toDouble() }
        bw.write("$%.2f\n".format(d * f * p))
    }

    bw.close()
    br.close()
}