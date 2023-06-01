import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val score = br.readLine().split(" ").map{ it.toInt() }
    val n = br.readLine().toInt()
    var result = 0
    repeat(n){
        var sum = 0

        repeat(3){
            val input = br.readLine().split(" ").map { it.toInt() }

            for(i in 0 until 3)
                sum += input[i] * score[i]
        }

        result = max(result, sum)
    }
    bw.write("$result")

    bw.close()
    br.close()
}