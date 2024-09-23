import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val title = Array(n) { "" }
    val power = IntArray(n)

    repeat(n) {
        val (t, p) = br.readLine().split(" ")
        title[it] = t
        power[it] = p.toInt()
    }

    repeat(m) {
        val p = br.readLine().toInt()
        var start = 0
        var end = n - 1

        while (start <= end) {
            val center = (start + end) / 2

            if (power[center] < p) {
                start = center + 1
            } else {
                end = center - 1
            }
        }
        bw.write("${title[start]}\n")
    }

    bw.close()
    br.close()
}