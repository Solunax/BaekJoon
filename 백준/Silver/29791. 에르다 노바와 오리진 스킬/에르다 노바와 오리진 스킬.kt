import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val er = br.readLine().split(" ").map { it.toInt() }.sorted()
    val or = br.readLine().split(" ").map { it.toInt() }.sorted()
    var erCount = 0
    var erTime = 0
    var orCount = 0
    var orTime = 0

    for (i in er.indices) {
        if (er[i] >= erTime) {
            erTime = er[i] + 100
            erCount++
        }
    }

    for (i in or.indices) {
        if (or[i] >= orTime) {
            orTime = or[i] + 360
            orCount++
        }
    }
    bw.write("$erCount $orCount")

    bw.close()
    br.close()
}