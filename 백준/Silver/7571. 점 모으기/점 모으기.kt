import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m) = br.readLine().split(" ").map { it.toInt() }
    val xArr = Array(m) { 0 }
    val yArr = Array(m) { 0 }

    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { v -> v.toInt() }

        xArr[it] = x
        yArr[it] = y
    }

    xArr.sort()
    yArr.sort()

    var result = 0
    val xCenter = xArr[m / 2]
    val yCenter = yArr[m / 2]

    for (i in 0 until m) {
        result += abs(xCenter - xArr[i]) + abs(yCenter - yArr[i])
    }

    bw.write("$result")

    bw.close()
    br.close()
}