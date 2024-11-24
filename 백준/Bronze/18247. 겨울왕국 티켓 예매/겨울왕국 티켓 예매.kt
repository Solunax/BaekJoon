import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }

        if (n < 12 || m < 4) {
            bw.write("-1\n")
        } else {
            bw.write("${m * 11 + 4}\n")
        }
    }

    bw.close()
    br.close()
}