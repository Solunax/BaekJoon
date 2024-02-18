import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val queue = LinkedList<Char>()

    "SciComLove".forEach {
        queue.offer(it)
    }

    repeat(br.readLine().toInt()) {
        queue.offer(queue.poll())
    }

    while (queue.isNotEmpty()){
        bw.write("${queue.poll()}")
    }

    bw.close()
    br.close()
}