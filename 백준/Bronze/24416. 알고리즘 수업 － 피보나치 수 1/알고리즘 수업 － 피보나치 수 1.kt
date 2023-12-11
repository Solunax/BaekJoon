import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var f1Count = 0
var f2Count = 0
lateinit var dp: Array<Int>

fun main() {
    val n = br.readLine().toInt()
    dp = Array(n + 1) { 0 }
    dp[1] = 1
    dp[2] = 1

    fib(n)
    fibonacci(n)

    bw.write("$f1Count $f2Count")

    bw.close()
    br.close()
}

fun fib(n: Int): Int {
    return if (n == 1 || n == 2){
        f1Count++
        1
    } else {
        fib(n - 1) + fib(n - 2)
    }
}

fun fibonacci(n : Int) : Int {
    for (i in 3 .. n) {
        f2Count++
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    return dp[n]
}