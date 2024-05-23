import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    if (input[1] == '0') {
        bw.write("${10 + input.substring(2).toInt()}")
    } else {
        bw.write("${Character.getNumericValue(input[0]) + input.substring(1).toInt()}")
    }

    bw.close()
    br.close()
}