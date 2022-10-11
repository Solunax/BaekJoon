import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()
    val level = br.readLine().split(" ").map{ it.toInt() }
    val pq = PriorityQueue<Int>{ o1, o2 ->
        o2 - o1
    }

    level.forEach {
        pq.add(it)
    }

    var result = 0
    while(pq.size != 1){
        val v1 = pq.poll()
        val v2 = pq.poll()
        result += (v1 + v2)
        pq.add(v1)
    }
    bw.write("$result")

    bw.close()
    br.close()
}