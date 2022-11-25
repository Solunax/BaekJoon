import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val bufferSize = br.readLine().toInt()
    val queue = LinkedList<Int>()

    while(true){
        val input = br.readLine().toInt()

        if(input == -1)
            break

        when(input){
            0 -> queue.poll()
            else -> {
                if(queue.size != bufferSize){
                    queue.offer(input)
                }
            }
        }
    }

    if(queue.size == 0)
        bw.write("empty")
    else{
        queue.forEach {
            bw.write("$it ")
        }
    }

    bw.close()
    br.close()
}