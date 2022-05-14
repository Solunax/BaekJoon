import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

var queue = LinkedList<Int>()
var top = 0

fun main() {
    val input = br.readLine().toInt()

    for(i in 1 .. input)
        queue.add(i)

    top = input
    while(top >= 2){
        queue.removeAt(0)
        top--
        val temp = queue[0]
        queue.removeAt(0)
        queue.add(temp)
    }

    bw.write("${queue[0]}")

    br.close()
    bw.close()
}

