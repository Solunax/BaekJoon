import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val lemon = br.readLine().split(" ").map { it.toInt() }
    var result = Int.MIN_VALUE

    for (i in 0 until n) {
        result = max(result, lemon[i] - n + i)
    }
    bw.write("$result")

    bw.close()
    br.close()
}