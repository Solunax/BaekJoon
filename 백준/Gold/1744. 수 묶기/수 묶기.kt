import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val plus = ArrayList<Int>()
    val minus = ArrayList<Int>()

    for(i in 0 until n){
        val input = br.readLine().toInt()
        if(input > 0)
            plus.add(input)
        else
            minus.add(input)
    }

    plus.sortDescending()
    minus.sort()

    var sum = 0
    var index = 0
    while (index < plus.size){
        sum += if(index + 1 < plus.size && plus[index] != 1 && plus[index + 1] != 1)
            plus[index++] * plus[index++]
        else
            plus[index++]
    }

    index = 0
    while (index < minus.size){
        sum += if(index + 1 < minus.size && minus[index] != 1 && minus[index + 1] != 1)
            minus[index++] * minus[index++]
        else
            minus[index++]
    }

    bw.write("$sum")
    bw.close()
    br.close()
}