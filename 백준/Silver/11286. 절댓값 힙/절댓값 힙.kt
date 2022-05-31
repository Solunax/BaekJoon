import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val queue = PriorityQueue<Int>(Comparator { o1, o2 ->
        val v1 = kotlin.math.abs(o1)
        val v2 = kotlin.math.abs(o2)
        if(v1 == v2){
            when(o1 > o2){
                true -> 1
                false -> -1
            }
        }else
            v1 - v2
    })

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