import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var str1 : CharArray
lateinit var str2 : CharArray
lateinit var dp : Array<Array<Int>>

fun main() {
    str1 = br.readLine().toCharArray()
    str2 = br.readLine().toCharArray()
    dp = Array(str1.size){ Array(str2.size){-1} }

    bw.write("${search(str1.size - 1, str2.size - 1)}")

    bw.close()
    br.close()
}

fun search(a : Int, b : Int) : Int{
    if(a < 0 || b < 0)
        return 0

    if(dp[a][b] == -1){
        dp[a][b] = 0
        if(str1[a] == str2[b])
            dp[a][b] = search(a - 1, b - 1) + 1
        else
            dp[a][b] = max(search(a - 1, b), search(a, b - 1))
    }

    return dp[a][b]
}