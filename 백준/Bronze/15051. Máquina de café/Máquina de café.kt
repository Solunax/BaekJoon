import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val v1 = br.readLine().toInt()
    val v2 = br.readLine().toInt()
    val v3 = br.readLine().toInt()

    bw.write("${min(v1 * 4 + v2 * 2, min(v1 * 2 + v3 * 2, v2 * 2 + v3 * 4))}")

    bw.close()
    br.close()
}