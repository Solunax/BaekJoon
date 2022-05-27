import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }
    val lis = Array(n){0}

    lis[0] = array[0]
    var size = 1

    for(i in 1 until n){
        val value = array[i]
        if(value > lis[size - 1]){
            size++
            lis[size - 1] = value
        }
        else{
            var low = 0
            var high = size
            while(low < high){
                val center = (high + low) / 2
                if(lis[center] < value)
                    low = center + 1
                else
                    high = center
            }
            lis[low] = value
        }
    }

    bw.write("$size")

    br.close()
    bw.close()
}