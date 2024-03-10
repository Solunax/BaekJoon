import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val lowCheck = listOf(0L, 1, 2)

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toLong()

        if (n in lowCheck) {
            bw.write("2\n")
        } else {
            while (true) {
                var check = true

                for (i in 2..sqrt(n.toDouble()).toInt()) {
                    if (n % i == 0L) {
                        check = false
                        break
                    }
                }

                if (check) {
                    bw.write("$n\n")
                    break
                }

                n++
            }
        }
    }

    bw.close()
    br.close()
}