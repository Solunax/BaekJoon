import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toLong() }

    var left = 0
    var right = n-1
    var minL = 0
    var minR = 0
    var min = Long.MAX_VALUE

    while(left < right){
        val sum = array[left] + array[right]

        if(min > abs(sum)){
            min = abs(sum)
            minL = left
            minR = right
        }

        if(sum >= 0)
            right--
        else
            left++
    }

    bw.write("${array[minL]} ${array[minR]}")

    bw.close()
    br.close()
}