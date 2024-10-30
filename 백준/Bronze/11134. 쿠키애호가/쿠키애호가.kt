import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, c) = br.readLine().split(" ").map { it.toInt() }

        if (n % c == 0) {
            bw.write("${n / c}\n")
        } else {
            bw.write("${n / c + 1}\n")
        }
    }

    bw.close()
    br.close()
}
