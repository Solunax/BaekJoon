import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sb = StringBuilder()

    for (i in 1..n) {
        if (i % 6 == 0) {
            sb.append("$i Go! ")
        } else {
            sb.append("$i ")
            if (i == n) {
                sb.append("Go!")
            }
        }
    }

    bw.write("$sb")

    bw.close()
    br.close()
}