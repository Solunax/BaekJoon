import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x1, y1) = br.readLine().split(" ").map { it.toDouble() }
    val (x2, y2) = br.readLine().split(" ").map { it.toDouble() }
    val (x3, y3) = br.readLine().split(" ").map { it.toDouble() }

    if (x1 == x2 || x2 == x3 || x1 == x3) {
        if (x1 == x2 && x2 == x3) {
            bw.write("WHERE IS MY CHICKEN?")
        } else {
            bw.write("WINNER WINNER CHICKEN DINNER!")
        }
    } else if (y1 == y2 || y2 == y3 || y1 == y3) {
        if (y1 == y2 && y2 == y3) {
            bw.write("WHERE IS MY CHICKEN?")
        } else {
            bw.write("WINNER WINNER CHICKEN DINNER!")
        }
    } else {
        if ((x2 - x1) / (y2 - y1) == (x3 - x1) / (y3 - y1)) {
            bw.write("WHERE IS MY CHICKEN?")
        } else {
            bw.write("WINNER WINNER CHICKEN DINNER!")
        }
    }

    bw.close()
    br.close()
}