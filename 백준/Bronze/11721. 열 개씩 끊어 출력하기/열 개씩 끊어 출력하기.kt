import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine()

    for(i in input.indices){
        bw.write("${input[i]}")
        if(i % 10 == 9)
            bw.write("\n")
    }

    bw.close()
    br.close()
}