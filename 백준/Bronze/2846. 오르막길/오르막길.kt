import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }

    var maxValue = 0
    var start = 0
    var previous = 0
    for(i in 1 until n){
        if(input[i] > input[previous])
            maxValue = max(input[i]-input[start], maxValue)
        else
            start = i

        previous = i
    }
    bw.write("$maxValue")

    br.close()
    bw.close()
}