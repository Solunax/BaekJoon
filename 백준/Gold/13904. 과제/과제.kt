import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    val info = Array(case){Array(2){0} }
    for(i in 0 until case)
        info[i] = br.readLine().split(" ").map { it.toInt() }.toTypedArray()

    info.sortWith { o1, o2 -> o2[0] - o1[0] }
    val lastDate = info[0][0]
    
    var result = 0
    var index = 0
    val queue = PriorityQueue<Array<Int>>{o1, o2 -> o2[1] - o1[1] }

    for(i in lastDate  downTo 1){
        while (index < case && info[index][0] >= i){
            queue.offer(info[index++])
        }

        if(queue.isNotEmpty())
            result += queue.poll()[1]
    }

    bw.write("$result")

    bw.close()
    br.close()
}
