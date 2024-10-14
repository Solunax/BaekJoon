import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (c, k, p) = br.readLine().split(" ").map { it.toInt() }
    var sum = 0

    for (i in 1..c) {
        sum += (k * i) + (p * i * i)
    }

    bw.write("$sum")

    bw.close()
    br.close()
}