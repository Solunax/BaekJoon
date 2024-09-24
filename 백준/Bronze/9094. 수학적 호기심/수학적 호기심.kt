import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        var result = 0

        for (a in 1 until n) {
            for (b in a + 1 until n) {
                if (((a * a) + (b * b) + m) % (a * b) == 0) {
                    result++
                }
            }
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}