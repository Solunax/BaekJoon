import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val result = when (val n = br.readLine().toInt() % 8) {
        0 -> 2
        7 -> 3
        6 -> 4
        else -> n
    }
    bw.write("$result")

    bw.close()
    br.close()
}