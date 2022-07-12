import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val count = br.readLine().toInt()
    val sold = HashMap<String, Int>()

    for(i in 0 until count){
        val input = br.readLine()
        if(sold.containsKey(input))
            sold[input] = sold[input]!!.plus(1)
        else
            sold[input] = 1
    }

    var max = 0
    sold.forEach{
        max = max(it.value, max)
    }

    val resultArray = ArrayList<String>()
    sold.forEach {
        if(it.value == max)
            resultArray.add(it.key)
    }

    resultArray.sort()
    bw.write(resultArray[0])

    bw.close()
    br.close()
}