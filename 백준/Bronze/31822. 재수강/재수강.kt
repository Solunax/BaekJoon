import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val code = br.readLine().substring(0, 5)
    var count = 0

    repeat(br.readLine().toInt()) {
        if (code == br.readLine().substring(0, 5)) {
            count++
        }
    }
    bw.write("$count")

    bw.close()
    br.close()
}