import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.ceil

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var n = br.readLine().toInt()
    val sb = StringBuilder()

    if (n == 0) {
        sb.append(0)
    } else {
        while (n != 1) {
            sb.append(abs(n % -2))
            n = ceil(n.toDouble() / -2).toInt()
        }
        sb.append(n)
    }
    bw.write(sb.reverse().toString())

    bw.close()
    br.close()
}