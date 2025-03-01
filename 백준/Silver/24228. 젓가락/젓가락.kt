import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, r) = br.readLine().split(" ").map { it.toLong() }
    bw.write("${n + 1 + 2 * (r - 1)}")

    bw.close()
    br.close()
}
