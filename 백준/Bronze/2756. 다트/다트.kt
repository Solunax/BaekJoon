import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toDouble() }
        var p1 = 0
        var p2 = 0

        for (i in 0 until 12 step 2) {
            val distance = getDistance(input[i], input[i + 1])

            val point = if (distance <= 3) {
                100
            } else if (distance <= 6) {
                80
            } else if (distance <= 9) {
                60
            } else if (distance <= 12) {
                40
            } else if (distance <= 15) {
                20
            } else {
                0
            }

            if (i < 6) {
                p1 += point
            } else {
                p2 += point
            }
        }

        bw.write("SCORE: $p1 to $p2, ")
        if (p1 > p2) {
            bw.write("PLAYER 1 WINS.\n")
        } else if (p2 > p1) {
            bw.write("PLAYER 2 WINS.\n")
        } else {
            bw.write("TIE.\n")
        }
    }

    bw.close()
    br.close()
}

fun getDistance(x: Double, y: Double): Double {
    return sqrt(x.pow(2) + y.pow(2))
}