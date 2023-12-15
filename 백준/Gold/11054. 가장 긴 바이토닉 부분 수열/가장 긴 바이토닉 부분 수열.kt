import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val numbers = arrayOf(0) + br.readLine().split(" ").map { it.toInt() }
    val upDp = Array(n + 1) { 0 }
    val downDp = Array(n + 1) { 0 }
    var result = 0

    for (i in 1..n) {
        upDp[i] = 1

        for (j in 1 until i) {
            if (numbers[i] > numbers[j]) {
                upDp[i] = max(upDp[i], upDp[j] + 1)
            }
        }
    }

    for (i in n downTo 1) {
        downDp[i] = 1

        for (j in n downTo i + 1) {
            if (numbers[i] > numbers[j]) {
                downDp[i] = max(downDp[i], downDp[j] + 1)
            }
        }
    }

    for (i in 1..n) {
        result = max(result, upDp[i] + downDp[i] - 1)
    }
    bw.write("$result")

    bw.close()
    br.close()
}