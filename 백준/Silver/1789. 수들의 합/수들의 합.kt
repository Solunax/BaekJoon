import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var input = br.readLine().toLong()
    var count = 0
    var sum = 0L
    var value = 1
    while(true){
        sum += value++

        if(sum > input)
            break

        count++
    }

    bw.write("$count")
    bw.close()
    br.close()
}