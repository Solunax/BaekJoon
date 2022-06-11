import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Collections
import java.util.LinkedList
import java.util.PriorityQueue
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (v1, v2) = br.readLine().split(" ")
    val num1 = ArrayList<Int>()
    num1.add(v1.toInt())

    val num2 = ArrayList<Int>()
    num2.add(v2.toInt())

    if(v1.contains("5"))
        num1.add(v1.replace("5", "6").toInt())

    if(v1.contains("6"))
        num1.add(v1.replace("6", "5").toInt())

    if(v2.contains("5"))
        num2.add(v2.replace("5", "6").toInt())

    if(v2.contains("6"))
        num2.add(v2.replace("6", "5").toInt())

    var minResult = Integer.MAX_VALUE
    var maxResult = 0

    for(i in num1.indices){
        for(j in num2.indices){
            val sum = num1[i] + num2[j]
            minResult = min(minResult, sum)
            maxResult = max(maxResult, sum)
        }
    }

    bw.write("$minResult $maxResult")

    bw.close()
    br.close()
}
