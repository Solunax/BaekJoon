import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, t, c, p) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${(n - 1) / t * c * p}")

    bw.close()
    br.close()
}