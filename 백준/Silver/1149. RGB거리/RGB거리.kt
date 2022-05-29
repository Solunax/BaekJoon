import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val cost = Array(n){Array(3) { 0 } }

    for(i in 0 until n)
        cost[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    
    for(i in 1 until n){
        cost[i][0] += min(cost[i - 1][1], cost[i - 1][2])
        cost[i][1] += min(cost[i - 1][0], cost[i - 1][2])
        cost[i][2] += min(cost[i - 1][0], cost[i - 1][1])
    }

    bw.write("${minOf(cost[n - 1][0], cost[n - 1][1], cost[n - 1][2])}")

    br.close()
    bw.close()
}