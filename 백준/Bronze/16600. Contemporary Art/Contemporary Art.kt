import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    bw.write("${sqrt(br.readLine().toDouble()) * 4}")

    bw.close()
    br.close()
}