import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val need = br.readLine().split(" ").map { it.toInt() }
    val money = br.readLine().toInt()
    var start = 0
    var end = need.max()

    while (start <= end) {
        val center = (start + end) / 2
        var cost = 0L

        for (i in 0 until n) {
            cost += if (need[i] > center) {
                center
            } else {
                need[i]
            }
        }

        if (cost <= money) {
            start = center + 1
        } else {
            end = center - 1
        }
    }
    bw.write("$end")

    bw.close()
    br.close()
}