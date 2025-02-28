import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        var result = 0L
        val n = br.readLine().toInt()
        val mission = Array(n) { List(3) { 0 } }

        repeat(n) {
            mission[it] = br.readLine().split(" ").map { v -> v.toInt() }
        }

        val (k, d, a) = br.readLine().split(" ").map { it.toLong() }

        repeat(n) {
            val money = (k * mission[it][0]) - (d * mission[it][1]) + (a * mission[it][2])

            result += if (money > 0) {
                money
            } else {
                0
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}