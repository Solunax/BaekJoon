import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()

    if (a + b * 7 > 30) {
        bw.write("0")
    } else {
        bw.write("1")
    }

    bw.close()
    br.close()
}