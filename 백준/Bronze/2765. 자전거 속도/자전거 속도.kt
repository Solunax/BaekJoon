import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var index = 1

    while (true) {
        val (r, spin, time) = br.readLine().split(" ").map { it.toDouble() }

        if (spin == 0.0) {
            break
        }

        val distance = (r * 3.1415927) * spin / 12 / 5280
        val mph = distance / (time / 3600)
        bw.write("Trip #%d: %.2f %.2f \n".format(index++, distance, mph))
    }

    bw.close()
    br.close()
}