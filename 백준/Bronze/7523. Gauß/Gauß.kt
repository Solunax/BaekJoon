import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { v -> v.toLong() }
        bw.write("Scenario #${it + 1}:\n${(n + m) * (m - n + 1) / 2}\n\n")
    }

    bw.close()
    br.close()
}