import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val queue = LinkedList<Int>()
    val n = br.readLine().toInt()

    repeat(n){
        queue.add(it + 1)
    }

    while (queue.size > 1){
        bw.write("${queue.pop()} ")
        queue.add(queue.pop())
    }

    bw.write("${queue.pop()}")

    bw.close()
    br.close()
}