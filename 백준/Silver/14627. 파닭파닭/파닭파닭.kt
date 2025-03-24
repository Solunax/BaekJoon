import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var arr: IntArray

fun main() {
    val (s, c) = br.readLine().split(" ").map { it.toInt() }
    arr = IntArray(s)
    var total = 0L

    repeat(s) {
        arr[it] = br.readLine().toInt()
        total += arr[it]
    }

    var start = 1
    var end = arr.max()
    var length = 0L

    while (start <= end) {
        val center = (start + end) / 2
        val chicken = cook(center)

        if (chicken >= c) {
            start = center + 1
            length = max(length, center.toLong())
        } else {
            end = center - 1
        }
    }
    bw.write("${total - (c * length)}")

    bw.close()
    br.close()
}

fun cook(len: Int): Long {
    var result = 0L

    for (i in arr.indices) {
        result += arr[i] / len
    }

    return result
}