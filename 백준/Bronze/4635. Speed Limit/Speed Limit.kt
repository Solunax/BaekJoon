import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    while (true) {
        val n = br.readLine().toInt()

        if (n == -1) {
            break
        }

        var time = 0
        var total = 0
        repeat(n) {
            val (speed, hour) = br.readLine().split(" ").map { it.toInt() }

            total += (hour - time) * speed
            time = hour
        }

        bw.write("$total miles\n")
    }

    bw.close()
    br.close()
}