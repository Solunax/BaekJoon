import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val sum = IntArray(n + 1)
    var result = 0L

    for (i in 0 until n) {
        sum[i + 1] = sum[i] + arr[i]
    }

    for (i in 0 until n) {
        result += arr[i] * (sum[n] - sum[i + 1])
    }
    bw.write("$result")

    bw.close()
    br.close()
}