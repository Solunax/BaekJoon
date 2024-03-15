import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val length = Array(6) { 0.0 }
        val point = Array(4) { Pair(0, 0) }

        repeat(4) {
            val (x, y) = br.readLine().split(" ").map { v -> v.toInt() }
            point[it] = Pair(x, y)
        }

        var index = 0
        for (i in 0 until 3) {
            for (j in i + 1 until 4) {
                length[index] = getDistance(point[i], point[j])
                index++
            }
        }

        length.sort()
        var check = true

        for (i in 1 until 4) {
            if (length[0] != length[i]) {
                check = false
                break
            }
        }

        if (length[4] != length[5]) {
            check = false
        }

        if (check) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}

fun getDistance(v1: Pair<Int, Int>, v2: Pair<Int, Int>): Double {
    val x = (v1.first - v2.first).toDouble()
    val y = (v1.second - v2.second).toDouble()

    return sqrt(x.pow(2) + y.pow(2))
}