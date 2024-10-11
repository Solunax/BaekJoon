import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, d, k, c) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)
    val visit = IntArray(d + 1)

    for (i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }

    var total = 0

    for (i in 0 until k) {
        if (visit[arr[i]] == 0) {
            total++
        }
        visit[arr[i]]++
    }

    var max = total

    for (i in 0 until n) {
        max = if (visit[c] == 0) {
            max(max, total + 1)
        } else {
            max(max, total)
        }

        visit[arr[i]]--
        if (visit[arr[i]] == 0) {
            total--
        }

        val end = (i + k) % n
        if (visit[arr[end]] == 0) {
            total++
        }
        visit[arr[end]]++
    }
    bw.write("$max")

    bw.close()
    br.close()
}