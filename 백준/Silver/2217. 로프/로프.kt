import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().toInt()
    val array = MutableList(input){0}

    for(i in 0 until input)
        array[i] = br.readLine().toInt()

    array.sort()

    var max = 0
    for(i in 0 until input)
        max = max(max, array[i] * (input - i))

    bw.write("$max")
    bw.flush()

    bw.close()
    br.close()
}