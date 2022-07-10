import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    for(i in 0 until case){
        var (j, n) = br.readLine().split(" ").map { it.toInt() }
        val queue = PriorityQueue<Int>{ o1, o2 -> o2 - o1 }

        for(j in 0 until n){
            val input = br.readLine().split(" ").map { it.toInt() }
            queue.add(input[0] * input[1])
        }
        var result = 0
        while(j > 0){
            j -= queue.poll()
            result++
        }

        bw.write("$result\n")
    }

    bw.close()
    br.close()
}