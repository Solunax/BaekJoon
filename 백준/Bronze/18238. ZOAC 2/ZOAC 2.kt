import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var result = 0
    var now = 'A'

    input.forEach {
        val temp = abs(it - now)
        result += min(temp, 26-temp)
        now = it
    }
    bw.write("$result")
    bw.close()
    br.close()
}