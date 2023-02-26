import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
var arr = Array(n){0}
val sumArr = Array(n){0}
val visit = Array(n){false}
var result = 0

fun main() {
    arr = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    dfs(0)
    bw.write("$result")

    br.close()
    bw.close()
}


fun dfs(count : Int){
    if(count == n){
        var sum = 0
        for(i in 0 until n-1)
            sum += abs(sumArr[i] - sumArr[i+1])

        result = max(sum, result)
        return
    }

    for(i in 0 until n){
        if(!visit[i]){
            visit[i] = true
            sumArr[count] = arr[i]
            visit[i] = true
            dfs(count + 1)
            visit[i] = false
        }
    }
}