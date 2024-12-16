import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (h, m) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${(h * 60 + m) - 540}")

    bw.close()
    br.close()
}