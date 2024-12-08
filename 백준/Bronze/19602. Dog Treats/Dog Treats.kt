import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val s = br.readLine().toInt()
    val m = br.readLine().toInt()
    val l = br.readLine().toInt()

    if (1 * s + 2 * m + 3 * l >= 10) {
        bw.write("happy")
    } else {
        bw.write("sad")
    }

    bw.close()
    br.close()
}
