import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import java.util.Arrays.sort
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfDeck = br.readLine().toInt()
    val queue = PriorityQueue<Long>()

    var result = 0L

    for(i in 0 until numberOfDeck)
        queue.add(br.readLine().toLong())

    while(queue.size > 1){
        val v1 = queue.poll()
        val v2 = queue.poll()

        result += v1 + v2
        queue.add(v1 + v2)
    }

    bw.write("$result")

    bw.close()
    br.close()
}
