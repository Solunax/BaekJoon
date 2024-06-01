import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (k, d, a) = br.readLine().split("/").map { it.toInt() }

    if (k + a < d || d == 0) {
        bw.write("hasu")
    } else {
        bw.write("gosu")
    }

    bw.close()
    br.close()
}