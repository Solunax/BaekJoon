import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    when (br.readLine().toInt() % 3) {
        1 -> bw.write("U")
        2 -> bw.write("O")
        0 -> bw.write("S")
    }

    bw.close()
    br.close()
}