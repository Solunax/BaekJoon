import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = when (br.readLine().toInt()) {
        0 -> 1
        1 -> 1
        2 -> 2
        3 -> 6
        4 -> 4
        else -> 0
    }
    bw.write("$result")

    bw.close()
    br.close()
}