import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var cat = ""

    for (i in 0 until 15) {
        val input = br.readLine()

        if (input.contains("w")) {
            cat = "chunbae"
            break
        }

        if (input.contains("b")) {
            cat = "nabi"
            break
        }

        if (input.contains("g")) {
            cat = "yeongcheol"
            break
        }
    }
    bw.write(cat)

    bw.close()
    br.close()
}