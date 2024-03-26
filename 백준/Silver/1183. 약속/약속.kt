import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = IntArray(n)

    repeat(n) {
        val (s, a) = br.readLine().split(" ").map { v -> v.toInt() }
        arr[it] = s - a
    }

    if (n % 2 == 0) {
        arr.sort()
        bw.write("${abs(arr[n / 2] - arr[n / 2 - 1]) + 1}")
    } else {
        bw.write("1")
    }

    bw.close()
    br.close()
}