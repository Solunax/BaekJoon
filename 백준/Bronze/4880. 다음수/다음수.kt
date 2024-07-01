import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (v1, v2, v3) = br.readLine().split(" ").map { it.toInt() }

        if (v1 == 0 && v2 == 0 && v3 == 0) {
            break
        }

        if (v3 - v2 == v2 - v1) {
            bw.write("AP ${v3 + (v2 - v1)}\n")
        } else {
            bw.write("GP ${v3 * (v2 / v1)}\n")
        }
    }

    bw.close()
    br.close()
}