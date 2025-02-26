import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var sum = 0

    repeat(n) {
        val score = br.readLine()
            .replace('0', '9')
            .replace('6', '9')
            .toInt()

        sum += if (score >= 100) {
            100
        } else {
            score
        }
    }
    bw.write("${(sum.toDouble() / n).roundToInt()}")

    bw.close()
    br.close()
}