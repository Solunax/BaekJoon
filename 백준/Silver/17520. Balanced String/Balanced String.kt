import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 1

    for (i in 0 until (n + 1) / 2) {
        result *= 2
        result %= 16769023
    }
    bw.write("$result")

    bw.close()
    br.close()
}