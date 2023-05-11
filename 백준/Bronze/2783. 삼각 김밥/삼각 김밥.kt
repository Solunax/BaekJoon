import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (sevenCost, sevenGram) = br.readLine().split(" ").map { it.toDouble() }
    var result = 1000 / sevenGram * sevenCost

    repeat(br.readLine().toInt()){
        val (cost, gram) = br.readLine().split(" ").map { it.toDouble() }
        val total = 1000 / gram * cost

        result = min(result, total)
    }

    bw.write("%.2f".format(result))

    bw.close()
    br.close()
}