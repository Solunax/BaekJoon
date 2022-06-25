import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val numberOfChapter = br.readLine().toInt()
        val chapters = br.readLine().split(" ").map { it.toLong() }.toTypedArray()

        val queue = PriorityQueue<Long>()
        for(i in 0 until numberOfChapter)
            queue.add(chapters[i])

        var sum = 0L
        while(queue.size > 1){
            val temp = queue.poll() + queue.poll()
            sum += temp
            queue.add(temp)
        }

        bw.write("$sum\n")
    }

    bw.close()
    br.close()
}