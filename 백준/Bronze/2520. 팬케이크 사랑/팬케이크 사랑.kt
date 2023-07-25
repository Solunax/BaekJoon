import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        br.readLine()
        val dough = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
        val topping = br.readLine().split(" ").map { it.toInt() }
        val needDough = listOf(0.5, 0.5, 0.25, 0.0625, 0.5625)
        val needTopping = listOf(1, 30, 25, 10)

        var d = Int.MAX_VALUE
        repeat(5){
            d = min(d, (dough[it] / needDough[it]).toInt())
        }

        var t = 0

        repeat(4){
            t += topping[it] / needTopping[it]
        }

        bw.write("${min(d, t)}\n")
    }

    bw.close()
    br.close()
}