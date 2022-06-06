import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var input = br.readLine().toInt()
    val time = listOf(300, 60, 10)
    val result = arrayOf(0, 0, 0)
    if(input % 10 != 0)
        bw.write("-1")
    else{
        for(i in 0 until 3){
            if(input >= time[i]){
                result[i] += input / time[i]
                input -= result[i] * time[i]
            }
        }
        bw.write("${result[0]} ${result[1]} ${result[2]}")
    }

    bw.close()
    br.close()
}