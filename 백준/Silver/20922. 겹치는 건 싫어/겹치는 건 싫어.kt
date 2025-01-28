import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    val count = IntArray(100001)
    var start = 0
    var end = 0
    var result = 0

    while (end < arr.size) {
        while (end < n && count[arr[end]] + 1 <= k) {
            count[arr[end++]]++
        }

        result = max(result, end - start)
        count[arr[start++]]--
    }
    bw.write("$result")

    bw.close()
    br.close()
}