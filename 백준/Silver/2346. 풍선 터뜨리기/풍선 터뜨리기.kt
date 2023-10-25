import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.absoluteValue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    val n = br.readLine().toInt()
    val move = br.readLine().split(" ")
    val deque = ArrayDeque((1..n).map {
        Balloon(it, move[it - 1].toInt())
    })

    val sb = StringBuilder()

    while(true){
        val next = deque.removeFirst()
        sb.append("${next.index} ")

        if(deque.isEmpty())
            break

        if(next.move > 0){
            for(i in 1 until next.move)
                deque.addLast(deque.removeFirst())
        } else {
            for(i in 1 .. next.move.absoluteValue)
                deque.addFirst(deque.removeLast())
        }
    }

    bw.write(sb.toString())
    bw.flush()

    bw.close()
    br.close()
}

data class Balloon(val index : Int, val move : Int)