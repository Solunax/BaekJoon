import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val stick = br.readLine()
    var s = stick.count { it == 's' }
    var t = stick.count { it == 't' }

    for (i in 0 until n) {
        if (s == t) {
            bw.write(stick.substring(i))
            break
        }

        when (stick[i]) {
            's' -> s--
            't' -> t--
        }
    }

    bw.close()
    br.close()
}