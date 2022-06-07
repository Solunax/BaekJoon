import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toMutableList()
    var sum = 0
    input.forEach{
        sum += it
    }

    if(!input.contains(0) || sum % 3 != 0)
        bw.write("-1")
    else{
        input.sortDescending()
        input.forEach {
            bw.write("$it")
        }
    }

    bw.close()
    br.close()
}