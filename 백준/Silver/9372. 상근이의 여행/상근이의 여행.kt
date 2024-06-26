import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        repeat(m) {
            br.readLine()
        }

        bw.write("${n - 1}\n")
    }

    bw.close()
    br.close()
}