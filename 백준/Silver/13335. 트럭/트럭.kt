import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val(_, w, l) = br.readLine().split(" ").map{ it.toInt() }

    val truck = LinkedList<Int>()
    br.readLine().split(" ").map { it.toInt() }.forEach {
        truck.add(it)
    }

    val bridge = LinkedList<Int>()
    for(i in 0 until w)
        bridge.add(0)

    var result = 0
    var weight = 0
    while(bridge.isNotEmpty()){
        result++
        weight -= bridge.poll()
        if(truck.isNotEmpty()){
            if(weight + truck.peek() <= l){
                weight += truck.peek()
                bridge.offer(truck.poll())
            }else
                bridge.add(0)
        }
    }
    bw.write("$result")

    bw.close()
    br.close()
}