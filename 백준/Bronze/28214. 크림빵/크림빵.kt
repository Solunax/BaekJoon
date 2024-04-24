import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k, p) = br.readLine().split(" ").map { it.toInt() }
    val bread = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    for (i in 0 until n * k step k) {
        var count = 0

        repeat(k) {
            if (bread[i + it] == 0) {
                count++
            }
        }

        if (count < p) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}