import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }

    if (r > c) {
        bw.write("${2 * (c - 1) + 1}")
    } else {
        bw.write("${2 * (r - 1)}")
    }

    bw.close()
    br.close()
}