import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, n) = br.readLine().split(" ").map { it.toInt() }
    var value = a.toDouble() % b

    for (i in 0 until n - 1) {
        value *= 10
        value %= b
    }

    bw.write("${((value / b) * 10).toInt()}")

    bw.close()
    br.close()
}