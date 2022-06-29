import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }
    val array = Array(10){0}

    input.forEach {
        array[it.toInt()]++
    }

    if((array[6] + array[9]) % 2 == 0){
        array[9] = (array[6] + array[9]) / 2
        array[6] = 0
    }else{
        array[9] = (array[6] + array[9]) / 2 + 1
        array[6] = 0
    }

    var result = 0

    for(i in array.indices){
        if(result < array[i])
            result = array[i]
    }

    bw.write("$result")
    bw.close()
    br.close()
}