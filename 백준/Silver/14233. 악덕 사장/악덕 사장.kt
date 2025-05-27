import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    val arr = IntArray(n)
    var result = Int.MAX_VALUE

    repeat(n) {
        arr[it] = input.nextToken().toInt()
    }
    arr.sort()

    for (i in 1..n) {
        result = min(arr[i - 1] / i, result)
    }
    bw.write("$result")

    bw.close()
    br.close()
}