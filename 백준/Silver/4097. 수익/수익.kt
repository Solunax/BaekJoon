import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toInt()

        if (n == 0) {
            break
        }

        var maxValue = Int.MIN_VALUE
        var sum = 0

        repeat(n) {
            val income = br.readLine().toInt()
            sum += income
            maxValue = max(maxValue, sum)

            if (sum < 0) {
                sum = 0
            }
        }
        bw.write("$maxValue\n")
    }

    bw.close()
    br.close()
}