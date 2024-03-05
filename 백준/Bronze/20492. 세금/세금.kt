import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val tax1 = (n * 0.22).toInt()
    val tax2 = (n * 0.2 * 0.22).toInt()

    bw.write("${n - tax1} ${n - tax2}")

    bw.close()
    br.close()
}