import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val s = br.readLine().toInt()
    val f = br.readLine().toInt()

    if (f < s) {
        bw.write("flight")
    } else {
        bw.write("high speed rail")
    }

    bw.close()
    br.close()
}