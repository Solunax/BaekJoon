import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    if (n % 7 == 0 || n % 7 == 2) {
        bw.write("CY")
    } else {
        bw.write("SK")
    }

    bw.close()
    br.close()
}