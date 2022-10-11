import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine().toInt()
    val drink = br.readLine().split(" ").map{ it.toDouble() }
    val pq = PriorityQueue<Double>{ o1, o2 ->
        o2.compareTo(o1)
    }

    drink.forEach {
        pq.add(it)
    }

    while(pq.size != 1){
        pq.add(pq.poll() + (pq.poll()/2))
    }
    bw.write("${pq.poll()}")
    
    bw.close()
    br.close()
}