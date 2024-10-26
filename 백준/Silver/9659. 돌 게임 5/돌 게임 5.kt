import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toLong()
    if (n % 2 == 0L) {
        bw.write("CY")
    } else {
        bw.write("SK")
    }

    bw.close()
    br.close()
}