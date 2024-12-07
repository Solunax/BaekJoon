import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var num: List<Int>
lateinit var op: IntArray
var n = 0
var resultMax = Int.MIN_VALUE
var resultMin = Int.MAX_VALUE

fun main() {
    n = br.readLine().toInt()
    op = IntArray(4)
    num = br.readLine().split(" ").map { it.toInt() }
    op = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    search(1, num[0])
    bw.write("$resultMax\n$resultMin")

    bw.close()
    br.close()
}

fun search(d: Int, sum: Int) {
    if (d == n) {
        resultMax = max(resultMax, sum)
        resultMin = min(resultMin, sum)
        return
    }

    for (i in 0 until 4) {
        if (op[i] == 0) {
            continue
        }

        op[i]--
        when (i) {
            0 -> search(d + 1, sum + num[d])
            1 -> search(d + 1, sum - num[d])
            2 -> search(d + 1, sum * num[d])
            3 -> search(d + 1, sum / num[d])
        }
        op[i]++
    }
}