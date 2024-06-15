import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var temperature = br.readLine().toDouble()

    while (true) {
        val now = br.readLine().toDouble()

        if (now == 999.0) {
            break
        }
        bw.write("%.2f\n".format(now - temperature))

        temperature = now
    }

    bw.close()
    br.close()
}