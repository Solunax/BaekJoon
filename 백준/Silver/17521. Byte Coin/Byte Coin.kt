import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(n, w) = br.readLine().split(" ").map{ it.toInt() }
    val graph = Array(n){ 0 }
    var result = w.toLong()
    var coin = 0L
    for(i in 0 until n)
        graph[i] = br.readLine().toInt()


    for(i in 0 until n - 1){
        if(coin == 0L && graph[i] < graph[i + 1]){
            coin = result / graph[i]
            result -= coin * graph[i]
        }

        if(graph[i] > graph[i + 1]){
            result += coin * graph[i]
            coin = 0
        }
    }

    result += coin * graph[n - 1]
    bw.write("$result")

    bw.close()
    br.close()
}