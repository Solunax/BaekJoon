import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 1
    var p = 1

    for (i in 1..n) {
        if (i % 2 == 0) {
            p += 1
        }

        result += p
    }
    bw.write("$result")

    bw.close()
    br.close()
}