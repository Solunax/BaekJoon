import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ").map { it.toInt() }

    if(v1 == 0 && v2 == 0)
        bw.write("Not a moose")
    else if(v1 == v2)
        bw.write("Even ${v1 * 2}")
    else
        bw.write("Odd ${max(v1, v2) * 2}")

    bw.close()
    br.close()
}