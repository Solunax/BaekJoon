import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val top = br.readLine().split(" ").map{ it.toInt() }

    var result = 0

    for(i in 0 until n){
        var kill = 0
        for(j in 1 + i until n){
            if(top[j] < top[i])
                kill++
            else
                break
        }
        result = max(result, kill)
    }

    bw.write("$result")
    bw.close()
    br.close()
}