import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val n = br.readLine().toInt()
val array = br.readLine().split(" ").map { it.toLong() }.sorted()
var max = Long.MAX_VALUE
val result = Array(3){0L}
fun main() {
    for(i in 0 until n-2){
        getResult(i)
    }

    result.sorted().forEach {
        bw.write("$it ")
    }

    bw.close()
    br.close()
}

fun getResult(index : Int){
    var left = index + 1
    var right = array.size - 1

    while(left < right){
        val sum = array[left] + array[right] + array[index]

        if(abs(sum) < max){
            result[0] = array[left]
            result[1] = array[right]
            result[2] = array[index]
            max = abs(sum)
        }

        if(sum > 0)
            right--
        else
            left++
    }
}