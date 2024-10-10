import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    var result = 0

    for (m in 1..k) {
        val t = if (n * m < 9) {
            n * m
        } else {
            (n * m).toString().reversed().toInt()
        }

        result = max(result, t)
    }
    bw.write("$result")

    bw.close()
    br.close()
}