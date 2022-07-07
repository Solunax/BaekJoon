import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue
import java.util.Stack
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val origin = br.readLine()

    origin.forEach {
        if(it.code in 65..90){
            if(it.code + 13 > 90)
                bw.write("${it - 13}")
            else
                bw.write("${it + 13}")
        }else if(it.code in 97 .. 122){
            if(it.code + 13 > 122)
                bw.write("${it - 13}")
            else
                bw.write("${it + 13}")
        }else
            bw.write("$it")
    }

    bw.close()
    br.close()
}