import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dp = Array(1000001) { 0 }
    var sqrt: Int
    var log: Int
    var sin: Int
    var n: Double
    dp[0] = 1

    for (i in 1..1000000) {
        n = i.toDouble()
        sqrt = floor((i - sqrt(n))).toInt()
        log = floor(ln(n)).toInt()
        sin = floor((i * sin(n) * sin(n))).toInt()

        dp[i] = (dp[sqrt] + dp[log] + dp[sin]) % 1000000
    }

    while (true) {
        val input = br.readLine().toInt()

        if (input == -1) {
            break
        }

        bw.write("${dp[input]}\n")
    }

    bw.close()
    br.close()
}