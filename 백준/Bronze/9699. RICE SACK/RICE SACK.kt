import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val result = br.readLine().split(" ").map { v -> v.toInt() }.max()
        bw.write("Case #${it + 1}: $result\n")
    }

    bw.close()
    br.close()
}