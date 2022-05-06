import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().toInt()
var array = Array(input){0}
var operation = Array(4){0}

var maxValue = Integer.MIN_VALUE
var minValue = Integer.MAX_VALUE

fun main() {
    array = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    operation = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    solve(array[0], 1)

    bw.write("$maxValue\n$minValue")
    br.close()
    bw.close()
}

fun solve(result:Int, count:Int){
    if(count == input){
        maxValue = max(maxValue, result)
        minValue = min(minValue, result)
        return
    }
    for(i in 0 until  4){
        if(operation[i] != 0){
            operation[i]--
            when(i){
                0 -> { solve(result + array[count], count + 1) }
                1 -> { solve(result - array[count], count + 1) }
                2 -> { solve(result * array[count], count + 1) }
                3 -> { solve(result / array[count], count + 1) }
            }
            operation[i]++
        }
    }
}