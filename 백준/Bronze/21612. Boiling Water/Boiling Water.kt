import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toInt()

    val value = 5 * input - 400
    bw.write("$value\n")

    if(value < 100)
        bw.write("1")
    else if (value == 100)
        bw.write("0")
    else
        bw.write("-1")

    bw.close()
    br.close()
}