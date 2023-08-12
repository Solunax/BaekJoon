import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val c = br.readLine()

    bw.write("${abs(c[0] - 'I') + 84}")

    bw.close()
    br.close()
}