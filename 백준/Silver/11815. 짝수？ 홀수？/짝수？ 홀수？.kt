import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val arr = br.readLine().split(" ").map { it.toLong() }

    for (n in arr) {
        val rn = sqrt(n.toDouble()).toLong()
        if (rn * rn == n) {
            bw.write("1 ")
        } else {
            bw.write("0 ")
        }
    }

    bw.close()
    br.close()
}