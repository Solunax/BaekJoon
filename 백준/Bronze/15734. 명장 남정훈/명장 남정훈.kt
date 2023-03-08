import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (l, r, b) = br.readLine().split(" ").map { it.toInt() }
    val sum = l + r + b
    val v = b - abs(l - r)

    if(v >= 0)
        bw.write("${sum - v % 2}")
    else
        bw.write("${sum - abs(v)}")

    br.close()
    bw.close()
}