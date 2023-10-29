import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, x) = br.readLine().split(" ").map { it.toInt() }
    val cost = br.readLine().split(" ").map { it.toInt() }
    var result = Int.MAX_VALUE

    for(i in 0 until n - 1)
        result = min(result, cost[i] * x + cost[i + 1] * x)

    bw.write("$result")

    bw.close()
    br.close()
}