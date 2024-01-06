import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (c, n) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(c + 101) { 10000000 }
    dp[0] = 0
    repeat(n) {
        val (cost, people) = br.readLine().split(" ").map { it.toInt() }

        for (i in people until c + 101) {
            dp[i] = min(dp[i], dp[i - people] + cost)
        }
    }

    var result = Int.MAX_VALUE
    for (i in c until c + 101){
        result = min(dp[i], result)
    }
    bw.write("$result")

    bw.close()
    br.close()
}