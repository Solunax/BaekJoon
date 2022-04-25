import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.absoluteValue
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()

    val count = br.readLine().toInt()

    var sum = 0
    val array = Array<Int>(count){0}
    
    for(i in 0 until count){
        array[i] = br.readLine().toInt()
        sum += array[i]
    }

    array.sort()
    var many = 0
    val freq = array.groupingBy { it }.eachCount()
    val maxValue = freq.maxOf { it.value }
    val duplicate = freq.filter { it.value == maxValue }
    val key = duplicate.keys.sorted()
    many = if(key.size == 1){
        key.first()
    }else{
        key[1]
    }

    println(round((sum.toDouble() / count.toDouble())).toInt())
    println(array[array.size/2])
    println(many)
    println(array[array.size - 1] - array[0])
}