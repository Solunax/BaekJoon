import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var now = 0
    var hourglassCheck = true

    repeat(n) {
        now += if (hourglassCheck) {
            1
        } else {
            -1
        }

        if (now <= 0) {
            now = 12
        }

        if (now > 12) {
            now = 1
        }

        val (card, time) = br.readLine().split(" ")

        if (card == "HOURGLASS" && now != time.toInt()) {
            hourglassCheck = !hourglassCheck
        }

        if (now == time.toInt() && card != "HOURGLASS") {
           bw.write("$now YES\n")
        } else {
            bw.write("$now NO\n")
        }
    }

    bw.close()
    br.close()
}