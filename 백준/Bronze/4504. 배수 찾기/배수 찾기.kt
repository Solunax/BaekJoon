import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    while (true) {
        val input = br.readLine().toInt()

        if (input == 0) {
            break
        }

        if (input % n == 0) {
            bw.write("$input is a multiple of $n.\n")
        } else {
            bw.write("$input is NOT a multiple of $n.\n")
        }
    }

    bw.close()
    br.close()
}