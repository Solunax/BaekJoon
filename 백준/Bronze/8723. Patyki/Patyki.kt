import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }.sorted()

    if ((c * c) == (a * a) + (b * b)) {
        bw.write("1")
    } else if (a == b && b == c) {
        bw.write("2")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}