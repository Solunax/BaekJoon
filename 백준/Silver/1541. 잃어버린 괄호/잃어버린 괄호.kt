import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.collections.ArrayList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var sum = 1000000
    val minus = br.readLine().split("-")

    for(i in minus.indices){
        var value = 0

        val plus = minus[i].split("+")
        for(j in plus.indices)
            value += plus[j].toInt()

        if(sum == 1000000)
            sum = value
        else
            sum -= value
    }

    bw.write("$sum")
    br.close()
    bw.close()
}