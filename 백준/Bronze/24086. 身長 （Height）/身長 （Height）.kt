import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${abs(br.readLine().toInt() - br.readLine().toInt())}")

    bw.close()
    br.close()
}