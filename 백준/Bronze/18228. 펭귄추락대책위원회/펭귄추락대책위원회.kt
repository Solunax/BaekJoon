import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val ice = br.readLine().split(" ").map { it.toInt() }
    val penguin  = ice.indexOf(-1)

    var left = Int.MAX_VALUE
    var right = Int.MAX_VALUE

    for(i in 0 until penguin)
        left = min(ice[i], left)

    for(i in penguin + 1 until n)
        right = min(ice[i], right)

    bw.write("${left + right}")

    bw.close()
    br.close()
}
