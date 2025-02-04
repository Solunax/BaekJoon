import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val h = br.readLine().toInt() * 100
    val w = br.readLine().toInt() * 100

    bw.write("${min(h, w) / 2}")

    bw.close()
    br.close()
}