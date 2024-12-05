import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var sour: IntArray
lateinit var bitter: IntArray
var n = 0
var result = Int.MAX_VALUE

fun main() {
    n = br.readLine().toInt()
    sour = IntArray(n)
    bitter = IntArray(n)

    repeat(n) {
        val (s, b) = br.readLine().split(" ").map { v -> v.toInt() }
        sour[it] = s
        bitter[it] = b
    }

    search(0, 1, 0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(d: Int, s: Int, b: Int, selectCount: Int) {
    if (d == n) {
        if (selectCount != 0) {
            result = min(result, abs(s - b))
        }

        return
    }

    search(d + 1, s * sour[d], b + bitter[d], selectCount + 1)
    search(d + 1, s, b, selectCount)
}