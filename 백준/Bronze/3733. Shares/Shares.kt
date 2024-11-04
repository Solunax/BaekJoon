import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val input = br.readLine() ?: break
        val (n, s) = input.split(" ").map { it.toInt() }
        bw.write("${s / (n + 1)}\n")
    }

    bw.close()
    br.close()
}