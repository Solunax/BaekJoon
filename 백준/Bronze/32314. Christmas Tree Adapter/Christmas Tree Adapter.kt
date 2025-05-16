import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()
    val (w, v) = br.readLine().split(" ").map { it.toInt() }

    if (w / v >= a) {
        bw.write("1")
    } else {
        bw.write("0")
    }

    bw.close()
    br.close()
}