import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.abs
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val odd = ArrayList<Int>()

    for(i in 0 until 7){
        val value = br.readLine().toInt()
        if(value % 2 != 0)
            odd.add(value)
    }

    odd.sort()
    if(odd.size == 0)
        bw.write("-1")
    else{
        var sum = 0
        odd.forEach {
            sum += it
        }
        bw.write("$sum\n")
        bw.write("${odd[0]}")
    }

    bw.close()
    br.close()
}