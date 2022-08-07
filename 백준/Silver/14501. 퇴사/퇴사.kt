import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = Array(n + 1){Pair(0, 0)}
    val dp = Array(n + 2){0}

    for(i in 1 .. n){
        val input = br.readLine().split(" ").map { it.toInt() }
        arr[i] = Pair(input[0], input[1])
    }

    for(i in n downTo 1){
        val index = i + arr[i].first
        if(index > n + 1)
            dp[i] = dp[i + 1]
        else
            dp[i] = max(dp[i + 1], arr[i].second + dp[index])
    }
    
    bw.write("${dp[1]}")
    bw.close()
    br.close()
}