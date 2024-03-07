import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a1, a0) = br.readLine().split(" ").map { it.toInt() }
    val c = br.readLine().toInt()
    val n = br.readLine().toInt()

    if (a1 * n + a0 <= c * n && a1 <= c) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}