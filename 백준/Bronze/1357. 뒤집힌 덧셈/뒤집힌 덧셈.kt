import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    val (v1, v2) = br.readLine().split(" ")
    val temp = (rev(v1) + rev(v2)).toString()
    bw.write("${rev(temp)}")

    bw.close()
    br.close()
}

fun rev(value:String):Int{
    val array = value.split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()

    var number = 1
    var result = 0
    array.forEach {
        result += number * it
        number *= 10
    }

    return result
}