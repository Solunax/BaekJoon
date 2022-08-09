import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val queue = PriorityQueue<Int> { o1, o2 -> o2 - o1}
    var p1 = br.readLine().toInt()

    repeat(n-1){
        queue.add(br.readLine().toInt())
    }
    var result = 0
    while(queue.isNotEmpty() && queue.peek() >= p1){
        p1++
        result++
        queue.add(queue.poll() - 1)
    }

    bw.write("$result")

    bw.close()
    br.close()
}