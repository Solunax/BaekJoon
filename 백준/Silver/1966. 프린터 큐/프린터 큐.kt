import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val queue = LinkedList<Pair<Int, Boolean>>()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val (numberOfDocument, sequence) = br.readLine().split(" ").map { it.toInt() }

        val values = br.readLine().split(" ").map { it.toInt() }
        
        for(i in values.indices){
            if(i == sequence)
                queue.add(Pair(values[i], true))
            else
                queue.add(Pair(values[i], false))
        }

        var count = 0

        while(true in queue.map { it.second }){
            if(queue[0].first == Collections.max(queue.map{ it.first} )){
                queue.removeAt(0)
                count++
            }else{
                queue.add(queue[0])
                queue.removeAt(0)
            }
        }

        bw.write("$count\n")
        queue.clear()
    }

    br.close()
    bw.close()
}

