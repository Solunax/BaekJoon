import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var pw: IntArray
lateinit var need: List<Int>
var result = 0

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }

    if (m == 0) {
        bw.write("${10.0.pow(n).toInt()}")
    } else {
        need = br.readLine().split(" ").map { it.toInt() }
        pw = IntArray(n)

        search(n, 0)
        bw.write("$result")
    }

    bw.close()
    br.close()
}

fun search(t: Int, d: Int) {
    if (d == t) {
        for (i in need.indices) {
            if (!pw.contains(need[i])) {
                return
            }
        }

        result++
        return
    }

    for (i in 0 until 10) {
        pw[d] = i
        search(t, d + 1)
    }
}