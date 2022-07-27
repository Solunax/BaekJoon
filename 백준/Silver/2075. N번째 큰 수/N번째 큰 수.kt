import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val queue = PriorityQueue<Int>{ o1, o2 -> o2 - o1 }

    for(i in 0 until n){
        br.readLine().split(" ").map { it.toInt() }.forEach {
            queue.add(it)
        }
    }


    repeat(n-1){
        queue.poll()
    }

    bw.write("${queue.poll()}")
    bw.close()
    br.close()
}