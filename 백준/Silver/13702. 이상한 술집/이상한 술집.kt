import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val drink = LongArray(n)

    repeat(n) {
        drink[it] = br.readLine().toLong()
    }

    var start = 1L
    var end = drink.max()

    while (start <= end) {
        val center = (start + end) / 2
        var count = 0L

        for (i in 0 until n) {
            count += drink[i] / center
        }

        if (count >= k) {
            start = center + 1
        } else {
            end = center - 1
        }
    }
    bw.write("$end")

    bw.close()
    br.close()
}