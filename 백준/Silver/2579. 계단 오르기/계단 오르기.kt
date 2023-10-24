import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val dp = Array(n + 1){0}
    val arr = Array(n + 1){0}

    repeat(n){
        arr[it + 1] = br.readLine().toInt()
    }

    dp[1] = arr[1]

    if(n >= 2)
        dp[2] = arr[1] + arr[2]

    for(i in 3 .. n)
        dp[i] = max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i]

    bw.write("${dp[n]}")

    bw.close()
    br.close()
}