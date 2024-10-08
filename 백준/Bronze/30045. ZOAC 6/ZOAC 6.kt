import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0

    repeat(br.readLine().toInt()) {
        val str = br.readLine()

        if (str.contains("01") || str.contains("OI")) {
            result++
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}