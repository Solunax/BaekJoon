import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, l) = br.readLine().split(" ").map { it.toInt() }
    val zebra = IntArray(n)
    var stripe = 0

    repeat(n) { idx ->
        var count = 0
        val body = br.readLine()

        if (body[0] == '1') {
            count++
        }

        for (i in 1 until l) {
            if (body[i - 1] == '0' && body[i] == '1') {
                count++
            }
        }

        zebra[idx] = count
        stripe = max(stripe, count)
    }
    bw.write("$stripe ${zebra.count { it == stripe }}")

    bw.close()
    br.close()
}