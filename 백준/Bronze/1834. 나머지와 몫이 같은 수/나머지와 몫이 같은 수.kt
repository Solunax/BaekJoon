import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    var sum = 0L

    for (i in 0 until n) {
        sum += (n * i) + i
    }

    bw.write("$sum")

    bw.close()
    br.close()
}