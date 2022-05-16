import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
fun main() {
    val dequeue = LinkedList<Int>()
    val res = LinkedList<Int>()

    val input = br.readLine().split(" ").map{ it.toInt()}
    val find = br.readLine().split(" ").map{ it.toInt() }.toMutableList()
    for(i in 0 until  input[0])
        dequeue.add(i + 1)

    var count = 0
    while(res.size < input[1]){
        if(dequeue.first == find[0]){
            res.add(find[0])
            dequeue.removeFirst()
            find.removeFirst()
        }else{
            count++
            val location = dequeue.indexOf(find[0])
            if((location % dequeue.size) < dequeue.size - (location % dequeue.size)){
                dequeue.add(dequeue.first)
                dequeue.removeFirst()
            }else{
                dequeue.addFirst(dequeue.last)
                dequeue.removeLast()
            }
        }
    }
    bw.write("$count")
    br.close()
    bw.close()
}