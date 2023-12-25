import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val s1 = br.readLine()
    val s2 = br.readLine()
    val dp = Array(s1.length + 1) { Array(s2.length + 1) { 0 } }

    for (i in 1..s1.length) {
        for (j in 1..s2.length) {
            dp[i][j] = if (s1[i - 1] == s2[j - 1]) {
                 dp[i - 1][j - 1] + 1
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    dp[i - 1][j]
                } else {
                    dp[i][j - 1]
                }
            }
        }
    }
    bw.write("${dp[s1.length][s2.length]}\n")

    val stack = Stack<Char>()
    var i = s1.length
    var j = s2.length

    while (i >= 1 && j >= 1) {
        if (dp[i][j] == dp[i - 1][j]) {
            i--
        } else if (dp[i][j] == dp[i][j - 1]) {
            j--
        } else {
            stack.push(s1[i - 1])
            i--
            j--
        }
    }

    while (stack.isNotEmpty()) {
        bw.write("${stack.pop()}")
    }

    bw.close()
    br.close()
}