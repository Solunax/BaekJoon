import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (a, b, c) = br.readLine().split(" ").map { it.toInt() }

    if (c % 2 == 1) {
        bw.write("${a xor b}")
    } else {
        bw.write("$a")
    }

    bw.close()
    br.close()
}