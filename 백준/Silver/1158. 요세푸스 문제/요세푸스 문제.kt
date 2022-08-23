import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val queue : Queue<Int> = LinkedList()

    repeat(n){
        queue.add(it+1)
    }

    bw.write("<")
    var count = 1
    while (queue.isNotEmpty()){
        if(count == k){
            val v = queue.poll()
            if(queue.isNotEmpty())
                bw.write("$v, ")
            else
                bw.write("$v")
            count = 0
        } else{
            queue.add(queue.poll())
        }
        count++
    }
    bw.write(">")

    bw.close()
    br.close()
}