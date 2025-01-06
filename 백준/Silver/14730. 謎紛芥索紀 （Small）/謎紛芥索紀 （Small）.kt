import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    repeat(br.readLine().toInt()) {
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() }
        result += v1 * v2
    }
    bw.write("$result")

    bw.close()
    br.close()
}