import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val liquid = br.readLine().split(" ").map{ it.toInt() }.sorted()

    var left = 0
    var right = liquid.size-1
    var result = Int.MAX_VALUE

    while (left < right){
        val sum = liquid[left] + liquid[right]
        if(sum >= 0)
            right--
        else
            left++
        if(abs(result) > abs(sum))
            result = sum
    }

    bw.write("$result")

    bw.close()
    br.close()
}