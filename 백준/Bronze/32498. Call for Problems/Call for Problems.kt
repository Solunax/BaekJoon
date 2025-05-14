import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var count = 0

    repeat(br.readLine().toInt()) {
        if (br.readLine().toInt() % 2 != 0) {
            count++
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}