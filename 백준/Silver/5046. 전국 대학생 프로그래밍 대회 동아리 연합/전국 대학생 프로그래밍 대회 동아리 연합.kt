import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, b, h, _) = br.readLine().split(" ").map { it.toInt() }
    var result = Int.MAX_VALUE

    repeat(h) {
        val fee = br.readLine().toInt()

        br.readLine().split(" ").map { it.toInt() }.forEach { p ->
            if (n <= p && n * fee <= b) {
                result = min(result, n * fee)
            }
        }
    }

    if (result != Int.MAX_VALUE) {
        bw.write("$result")
    } else {
        bw.write("stay home")
    }

    bw.close()
    br.close()
}