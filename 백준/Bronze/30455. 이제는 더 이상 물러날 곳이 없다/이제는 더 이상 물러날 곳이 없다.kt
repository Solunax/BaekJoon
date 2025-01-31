import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    if (br.readLine().toInt() % 2 == 0) {
        bw.write("Duck")
    } else {
        bw.write("Goose")
    }

    bw.close()
    br.close()
}