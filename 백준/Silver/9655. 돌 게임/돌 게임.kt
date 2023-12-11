import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    if (br.readLine().toInt() % 2 == 0) {
        bw.write("CY")
    } else {
        bw.write("SK")
    }

    bw.close()
    br.close()
}