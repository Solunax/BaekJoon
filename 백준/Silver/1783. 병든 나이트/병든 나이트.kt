import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    val result = if (n == 1) {
        1
    } else if (n == 2) {
        min((m + 1) / 2, 4)
    } else {
        if (m < 7) {
            min(m, 4)
        } else {
            m - 2
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}