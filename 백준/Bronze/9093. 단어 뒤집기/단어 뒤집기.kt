import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val input = br.readLine().split(" ")

        input.forEach {
            bw.write("${it.reversed()} ")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}