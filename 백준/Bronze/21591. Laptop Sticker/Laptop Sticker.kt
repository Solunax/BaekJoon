import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h ,sw, sh) = br.readLine().split(" ").map { it.toInt() }

    if(w - 2 >= sw && h - 2 >= sh)
        bw.write("1")
    else
        bw.write("0")

    bw.close()
    br.close()
}