import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine()

    val result = if (n.contains("7")) {
        if (n.toInt() % 7 == 0) {
            3
        } else {
            2
        }
    } else {
        if (n.toInt() % 7 == 0) {
            1
        } else {
            0
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}