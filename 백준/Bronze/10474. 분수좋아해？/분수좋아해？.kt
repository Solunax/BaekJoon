import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

        if (v1 == 0 && v2 == 0) {
            break
        }

        bw.write("${v1 / v2} ${v1 % v2} / $v2\n")
    }

    bw.close()
    br.close()
}