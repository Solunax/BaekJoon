import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt() / 3
    var count = 0

    for (i in 1..n) {
        for (j in 1..n) {
            if (n - i - j > 0) {
                count++
            }
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}