import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map{ it.toInt() }.toMutableList()
    var count = 1

    for(num in 1111 until getClockNumber(input)){
        if(!num.toString().contains("0")){
            val n = num.toString().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toMutableList()
            if(num == getClockNumber(n))
                count++
        }
    }

    bw.write("$count")

    bw.close()
    br.close()
}

fun getClockNumber(arr : MutableList<Int>) : Int{
    var minValue = Int.MAX_VALUE

    repeat(4){
        val sb = StringBuilder()

        sb.append(arr[0])
        sb.append(arr[1])
        sb.append(arr[2])
        sb.append(arr[3])
        minValue = min(minValue, sb.toString().toInt())

        arr.add(arr[0])
        arr.removeFirst()
    }

    return minValue
}
