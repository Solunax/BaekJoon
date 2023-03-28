import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${br.readLine().toInt() + br.readLine().toInt()}")

    br.close()
    bw.close()
}