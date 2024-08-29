import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    if (c in a until b) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}