import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map { it.toInt() }

    if (m < k) {
        bw.write("0")
    } else {
        var result = 0

        repeat(n) {
            val line = br.readLine()
            var count = 1

            repeat(m) {
                if (line[it] == '0') {
                    if (count >= k) {
                        result++
                    }
                    count++
                } else {
                    count = 1
                }
            }
        }

        bw.write("$result")
    }

    bw.close()
    br.close()
}