import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n1, n2, n12) = br.readLine().split(" ").map { it.toInt() + 1 }
    bw.write("${n1 * n2 / n12 - 1}")

    bw.close()
    br.close()
}