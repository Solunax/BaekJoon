import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var case = 1
    while (true) {
        val input = br.readLine().split(" ").map { it.toInt() }

        if (input[0] == 0) {
            break
        }

        bw.write("Case ${case++}: Sorting... done!\n")
    }

    bw.close()
    br.close()
}