import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (t, v) = br.readLine().split(" ").map { it.toInt() }
    val (nt, nv) = br.readLine().split(" ").map { it.toInt() }

    if (nt < 0 && nv >= 10) {
        bw.write("A storm warning for tomorrow! Be careful and stay home if possible!")
    } else if (t > nt) {
        bw.write("MCHS warns! Low temperature is expected tomorrow.")
    } else if (v < nv) {
        bw.write("MCHS warns! Strong wind is expected tomorrow.")
    } else {
        bw.write("No message")
    }

    bw.close()
    br.close()
}