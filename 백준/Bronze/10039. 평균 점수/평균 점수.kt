import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 0

    repeat(5) {
        val n = br.readLine().toInt()
        sum += if (n > 40) {
            n
        } else {
            40
        }
    }

    bw.write("${sum / 5}")

    bw.close()
    br.close()
}