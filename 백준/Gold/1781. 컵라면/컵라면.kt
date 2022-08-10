import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var result = 0

    val array = Array(n){List(2){0} }
    val queue = PriorityQueue<Int>()

    repeat(n){
        array[it] = br.readLine().split(" ").map{ v -> v.toInt() }
    }

    array.sortWith{ o1, o2 ->
        o1[0] - o2[0]
    }

    array.forEach {
        queue.add(it[1])
        if(queue.size > it[0])
            queue.poll()
    }

    while(queue.isNotEmpty()){
        result += queue.poll()
    }

    bw.write("$result")
    bw.close()
    br.close()
}