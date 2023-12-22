import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = listOf(0) + br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n + 1) { 1 }
    var len = 1

    for (i in 1..n) {
        for (j in 1 until i) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
                len = max(len, dp[i])
            }
        }
    }
    bw.write("$len\n")

    val stack = Stack<Int>()
    for (i in n downTo 1) {
        if (len == dp[i]) {
            stack.push(arr[i])
            len--
        }
    }

    while (stack.isNotEmpty()) {
        bw.write("${stack.pop()} ")
    }

    bw.close()
    br.close()
}