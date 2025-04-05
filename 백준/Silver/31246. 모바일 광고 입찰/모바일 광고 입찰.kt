import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)

    repeat(n) {
        val (a, b) = br.readLine().split(" ").map { v -> v.toInt() }
        arr[it] = b - a
    }

    arr.sort()
    bw.write("${max(0, arr[k - 1])}")

    bw.close()
    br.close()
}