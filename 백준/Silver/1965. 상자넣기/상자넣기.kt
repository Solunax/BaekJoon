import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val box = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(n){1}
    var result = 0

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (box[i] > box[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        result = max(result, dp[i]) 
    }
    
    bw.write("$result")

    bw.close()
    br.close()
}