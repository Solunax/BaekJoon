import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    if (n % 7 == 1 || n % 7 == 3) {
        bw.write("CY")
    } else {
        bw.write("SK")
    }

    bw.close()
    br.close()
}