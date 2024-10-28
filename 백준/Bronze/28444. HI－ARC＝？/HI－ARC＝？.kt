import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (h, i, a, r, c) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${(h * i) - (a * r * c)}")

    bw.close()
    br.close()
}