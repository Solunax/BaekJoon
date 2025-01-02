import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    for (a in 1..n / 3) {
        for (b in a..(n - a) / 2) {
            val c = n - a - b

            if (b > c) {
                break
            }

            if (c < a + b) {
                result++
            }
        }
    }

    bw.write("$result")


    bw.close()
    br.close()
}