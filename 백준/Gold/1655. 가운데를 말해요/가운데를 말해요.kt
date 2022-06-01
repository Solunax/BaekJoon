import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()

    val minQueue = PriorityQueue<Int>(Comparator { o1, o2 -> o1 - o2 })
    val maxQueue = PriorityQueue<Int>(Comparator { o1, o2 -> o2 - o1 })

    for(i in 0 until n){
        val input = br.readLine().toInt()

        if(minQueue.size == maxQueue.size)
            maxQueue.add(input)
        else
            minQueue.add(input)

        if(minQueue.isNotEmpty() && maxQueue.isNotEmpty()){
            if(minQueue.peek() < maxQueue.peek())
                minQueue.add(maxQueue.poll()).also { maxQueue.add(minQueue.poll()) }
        }

        bw.write("${maxQueue.peek()}\n")
    }

    bw.close()
    br.close()
}