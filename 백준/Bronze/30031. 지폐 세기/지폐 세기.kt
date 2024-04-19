import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var total = 0

    repeat(br.readLine().toInt()) {
        val (w, h) = br.readLine().split(" ").map { it.toInt() }

        total += if (h == 68) {
            when (w) {
                136 -> 1000
                142 -> 5000
                148 -> 10000
                154 -> 50000
                else -> 0
            }
        } else {
            0
        }
    }
    bw.write("$total")

    bw.close()
    br.close()
}