import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (d, n, s, p) = br.readLine().split(" ").map { it.toInt() }
        val serialize = n * s
        val parallelize = n * p + d

        if (serialize < parallelize) {
            bw.write("do not parallelize\n")
        } else if (serialize == parallelize) {
            bw.write("does not matter\n")
        } else {
            bw.write("parallelize\n")
        }
    }

    bw.close()
    br.close()
}