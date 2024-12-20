import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (x, y) = br.readLine().split(" ").map { it.toInt() }

    if (x > y) {
        bw.write("${x + y}")
    } else {
        bw.write("${y - x}")
    }

    bw.close()
    br.close()
}