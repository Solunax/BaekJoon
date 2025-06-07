import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val str = br.readLine()
        if (str.last() != '.') {
            bw.write("$str.\n")
        } else {
            bw.write("$str\n")
        }
    }

    bw.close()
    br.close()
}