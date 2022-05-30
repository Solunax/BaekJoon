import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val queue = PriorityQueue<Int>(reverseOrder())

    for(i in 0 until n){
        val input = br.readLine().toInt()
        if(input == 0){
            if(queue.size == 0 )
                bw.write("0\n")
            else
                bw.write("${queue.poll()}\n")
        }
        else
            queue.add(input)
    }

    bw.close()
    br.close()
}