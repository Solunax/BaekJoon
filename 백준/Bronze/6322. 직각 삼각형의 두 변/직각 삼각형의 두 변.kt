import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var case = 1
    while (true) {
        val (a, b, c) = br.readLine().split(" ").map { it.toDouble() }

        if (a == 0.0 && b == 0.0 && c == 0.0) {
            break
        }

        bw.write("Triangle #${case++}\n")

        if (c == -1.0) {
            bw.write("c = %.3f\n\n".format(sqrt(a.pow(2) + b.pow(2))))
        } else if (max(a, b) >= c) {
            bw.write("Impossible.\n\n")
        } else if (a == -1.0) {
            bw.write("a = %.3f\n\n".format(sqrt(c.pow(2) - b.pow(2))))
        } else {
            bw.write("b = %.3f\n\n".format(sqrt(c.pow(2) - a.pow(2))))
        }
    }

    bw.close()
    br.close()
}