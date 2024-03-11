import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var sum = 0

    for (i in 0..n) {
        for (j in i..n) {
            sum += i + j
        }
    }
    bw.write("$sum")

    bw.close()
    br.close()
}