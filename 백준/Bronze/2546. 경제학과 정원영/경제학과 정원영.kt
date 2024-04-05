import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        var count = 0
        br.readLine()
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val c = br.readLine().split(" ").map { it.toDouble() }
        val e = br.readLine().split(" ").map { it.toDouble() }

        val cSum = c.sum()
        val eSum = e.sum()

        for (i in 0 until n) {
            if (cSum > c[i] * n && eSum < c[i] * m) {
                count++
            }
        }
        bw.write("$count\n")
    }

    bw.close()
    br.close()
}