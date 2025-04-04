import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (a, b) = br.readLine().split(" ").map { it.toLong() }
        bw.write("${(a / b * a / b)}\n")
    }

    bw.close()
    br.close()
}