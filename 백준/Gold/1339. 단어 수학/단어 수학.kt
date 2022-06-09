import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toInt()
    val array = Array(26){0}

    for(i in 0 until input){
        val value = br.readLine()
        val size = value.length
        var multi = (10.0.pow(size - 1)).toInt()

        for(j in 0 until size){
            array[value[j] - 'A'] += multi
            multi /= 10
        }
    }
    array.sort()
    
    var result = 0
    for(i in 25 downTo 17)
        result += array[i] * (i - 16)

    bw.write("$result")

    bw.close()
    br.close()
}
