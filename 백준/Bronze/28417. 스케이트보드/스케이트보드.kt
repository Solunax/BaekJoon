import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var maxScore = 0

    repeat(br.readLine().toInt()){
        val score = br.readLine().split(" ").map { it.toInt() }
        val run = score.subList(0, 2).sortedDescending()
        val trick = score.subList(2, 7).sortedDescending()

        maxScore = max(maxScore, run[0] + trick[0] + trick[1])
    }
    bw.write("$maxScore")

    bw.close()
    br.close()
}