import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val map = IntArray(1000001)
    val dist = 2 * k + 1

    repeat(n) {
        val (g, x) = br.readLine().split(" ").map { it.toInt() }
        map[x] = g
    }

    var ice = 0
    var result = 0
    for (i in 0..1000000) {
        if (i >= dist) {
            ice -= map[i - dist]
        }

        ice += map[i]
        result = max(result, ice)
    }
    bw.write("$result")

    bw.close()
    br.close()
}