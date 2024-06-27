import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (b, n) = br.readLine().split(" ").map { it.toDouble() }

        if (b == 0.0 && n == 0.0) {
            break
        }

        var num1 = 0.0
        var num2: Double
        var temp = 0.0

        while (true) {
            val pow = temp.pow(n)
            if (pow <= b) {
                num1 = temp
            } else {
                num2 = temp
                break
            }

            temp += 1
        }

        if (abs(num1.pow(n) - b) <= abs(num2.pow(n)) - b) {
            bw.write("${num1.toInt()}\n")
        } else {
            bw.write("${num2.toInt()}\n")
        }
    }

    bw.close()
    br.close()
}