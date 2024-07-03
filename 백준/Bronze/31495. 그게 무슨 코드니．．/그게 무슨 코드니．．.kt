import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val str = br.readLine()

    if (str.first() == '"' && str.last() == '"' && str.length != 1) {
        val result = str.substring(1, str.length - 1)
        if (result.isNotEmpty()) {
            bw.write(result)
        } else {
            bw.write("CE")
        }
    } else {
        bw.write("CE")
    }

    bw.close()
    br.close()
}