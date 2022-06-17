import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }

    var sum = 0
    input.forEach {
        sum += it * it
    }

    bw.write("${sum%10}")

    bw.close()
    br.close()
}
