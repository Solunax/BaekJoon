import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c, n) = br.readLine().split(" ").map { it.toInt() }
    var result = false

    for (i in 0..n / a) {
        for (j in 0..n / b) {
            for (k in 0..n / c) {
                if (a * i + b * j + c * k == n) {
                    result = true
                }
            }
        }
    }

    if (result) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}