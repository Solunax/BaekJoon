import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (a, b) = br.readLine().split(" ").map { it.toInt() }
    var c = 0
    var score = 512

    while (score > 0) {
        var hit = 0

        if (a >= score) {
            a -= score
            hit++
        }

        if (b >= score) {
            b -= score
            hit++
        }

        if (hit == 1) {
            c += score
        }

        score /= 2
    }
    bw.write("$c")

    bw.close()
    br.close()
}