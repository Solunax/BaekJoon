import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine()

        if (input.isNullOrEmpty()) {
            break
        }

        val p = input.split(" ").map { it.toDouble() }
        val p1 = Point(p[0], p[1])
        val p2 = Point(p[2], p[3])
        val p3 = Point(p[4], p[5])
        val p4 = Point(p[6], p[7])
        var x: Double
        var y: Double

        if (p1 == p3) {
            x = p2.x + p4.x - p1.x
            y = p2.y + p4.y - p1.y
        } else if (p1 == p4) {
            x = p2.x + p3.x - p1.x
            y = p2.y + p3.y - p1.y
        } else if (p2 == p3) {
            x = p1.x + p4.x - p2.x
            y = p1.y + p4.y - p2.y
        } else {
            x = p1.x + p3.x - p2.x
            y = p1.y + p3.y - p2.y
        }

        bw.write("%.3f %.3f\n".format(x, y))
    }

    bw.close()
    br.close()
}

class Point(val x: Double, val y: Double) {
    override fun equals(other: Any?): Boolean {
        other as Point
        return x == other.x && y == other.y
    }
}