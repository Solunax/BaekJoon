import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val t = br.readLine().toDouble()
    bw.write("%.0f".format((t / 2) * (t / 2)))

    bw.close()
    br.close()
}