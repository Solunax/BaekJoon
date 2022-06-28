import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Integer.min
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfTeams = br.readLine().toInt()
    val list = LinkedList(br.readLine().split(" ").map { it.toInt() }.sorted())

    var min = Integer.MAX_VALUE
    for(i in 0 until numberOfTeams)
        min = min(list.removeFirst() + list.removeLast(), min)

    bw.write("$min")
    bw.close()
    br.close()
}