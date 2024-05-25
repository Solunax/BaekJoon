import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (s, t, d) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${(d / (s * 2)) * t}")

    bw.close()
    br.close()
}