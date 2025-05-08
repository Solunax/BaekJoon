import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (c, b) = br.readLine().split(" ").map { it.toDouble() }
    bw.write("${c / b}")

    bw.close()
    br.close()
}