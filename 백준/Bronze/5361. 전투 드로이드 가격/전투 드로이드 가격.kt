import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val cost = listOf(350.34, 230.9, 190.55, 125.3, 180.9)
    repeat(br.readLine().toInt()) {
        var sum = 0.0
        var idx = 0
        br.readLine().split(" ").map { it.toInt() }.forEach {
            sum += cost[idx++] * it
        }

        bw.write("$%.2f\n".format(sum))
    }

    bw.close()
    br.close()
}