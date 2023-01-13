import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toLong() }

    var result = 0L
    for(i in 0 until n){
        for(j in 0 until n)
            result += abs(input[i] - input[j])
    }
    bw.write("$result")

    br.close()
    bw.close()
}