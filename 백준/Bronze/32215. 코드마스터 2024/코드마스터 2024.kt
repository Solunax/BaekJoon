import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (_, m, k) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${m * k + m}")

    bw.close()
    br.close()
}