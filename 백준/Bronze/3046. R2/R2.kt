import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r1, s) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${s * 2 - r1}")

    bw.close()
    br.close()
}