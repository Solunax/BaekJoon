import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var n = input.toLong()
    var result = 0L

    for (i in input.indices) {
        val num = n % 10
        n /= 10

        result += if (num > 4) {
            ((num - 1) * 9.0.pow(i)).toLong()
        } else {
            (num * 9.0.pow(i)).toLong()
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}