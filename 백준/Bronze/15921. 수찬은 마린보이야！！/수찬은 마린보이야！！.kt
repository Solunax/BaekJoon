import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    if (n == 0) {
        bw.write("divide by zero")
    } else {
        val arr = br.readLine().split(" ").map { it.toDouble() }
        val avg = arr.sum() / n
        var p = 0.0

        repeat(n) {
            p += arr[it] / n
        }

        bw.write("%.2f".format(avg / p))
    }

    bw.close()
    br.close()
}