import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        var missingCount = 0.0
        var total = 0.0
        while (true) {
            val input = br.readLine()

            if (input.isNullOrBlank()) {
                break
            }
            val missing = input.count { it == '#' }
            total += input.length
            missingCount += input.length - missing.toDouble()
        }

        val ratio = round((missingCount / total) * 100 * 10) / 10

        if (ratio.toString().split(".").last() == "0") {
            bw.write("Efficiency ratio is %d%%.\n".format(ratio.toInt()))
        } else {
            bw.write("Efficiency ratio is %.1f%%.\n".format(ratio))
        }
    }

    bw.close()
    br.close()
}