import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    var maxLen = 1
    var nowLen = 1
    for(i in 0 until n - 1){
        if(arr[i] <= arr[i + 1])
            nowLen++
        else{
            maxLen = max(maxLen, nowLen)
            nowLen = 1
        }
    }
    maxLen = max(maxLen, nowLen)

    nowLen = 1
    for(i in 0 until n - 1){
        if(arr[i] >= arr[i + 1])
            nowLen++
        else {
            maxLen = max(maxLen, nowLen)
            nowLen = 1
        }
    }
    maxLen = max(maxLen, nowLen)

    bw.write("$maxLen")

    br.close()
    bw.close()
}