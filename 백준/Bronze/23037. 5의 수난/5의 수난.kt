import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val num = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toDouble() }
    var sum = 0.0

    num.forEach {
        sum += it.pow(5)
    }

    bw.write("${sum.toInt()}")

    bw.close()
    br.close()
}