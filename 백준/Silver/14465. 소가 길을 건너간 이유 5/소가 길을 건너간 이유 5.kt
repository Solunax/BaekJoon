import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k, b) = br.readLine().split(" ").map { it.toInt() }
    val light = BooleanArray(n + 1)

    repeat(b) {
        light[br.readLine().toInt()] = true
    }

    var result = 0
    for (i in 1..k) {
        if (light[i]) {
            result++
        }
    }

    var count = result
    for (i in k + 1..n) {
        if (light[i - k]) {
            count--
        }

        if (light[i]) {
            count++
        }

        result = min(result, count)
    }

    bw.write("$result")

    bw.close()
    br.close()
}