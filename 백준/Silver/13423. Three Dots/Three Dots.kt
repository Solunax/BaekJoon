import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val dots = br.readLine().split(" ").map { it.toInt() }.sorted()
        var count = 0

        for (a in 0 until n - 2) {
            var c = a + 2

            for (b in a + 1 until n - 1) {
                val dist = dots[b] - dots[a]

                while (c < n && dots[c] - dots[b] < dist) {
                    c++
                }

                if (c == n) {
                    break
                }

                if (dots[c] - dots[b] == dist) {
                    count++
                }
            }
        }
        bw.write("$count\n")
    }

    bw.close()
    br.close()
}