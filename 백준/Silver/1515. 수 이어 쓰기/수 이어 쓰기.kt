import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()
    var point = 0
    var b = 0
    var result = -1

    while (b++ <= 30000 && result == -1) {
        val temp = b.toString()

        for (i in temp.indices) {
            if (temp[i] == input[point]) {
                point++
            }

            if (point == input.length) {
                result = b
                break
            }
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}