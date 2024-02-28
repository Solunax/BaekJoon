import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }

        if (a + b != 0) {
            bw.write("${a + b}\n")
        } else {
            break
        }
    }

    bw.close()
    br.close()
}