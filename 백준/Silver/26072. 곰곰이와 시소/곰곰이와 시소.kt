import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, _) = br.readLine().split(" ").map { it.toInt() }
    val x = br.readLine().split(" ").map { it.toDouble() }
    val w = br.readLine().split(" ").map { it.toDouble() }
    var result = 0.0
    val div = w.sum()

    repeat(n) {
        result += x[it] * w[it]
    }
    bw.write("${result / div}")

    bw.close()
    br.close()
}