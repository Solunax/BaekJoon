import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = Array(n){Pair(0, 0.0)}

    repeat(n){
        val input = br.readLine().split(" ").map { o -> o.toInt() }.toTypedArray()
        array[it] = Pair(it, input[0].toDouble() / input[1].toDouble())
    }

    array.sortBy { it.second }

    array.forEach {
        bw.write("${it.first + 1} ")
    }

    bw.close()
    br.close()
}