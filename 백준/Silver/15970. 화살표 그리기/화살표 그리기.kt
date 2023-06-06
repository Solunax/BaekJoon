import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val dot = HashMap<Int, ArrayList<Int>>()

    repeat(br.readLine().toInt()){
        val (location, color) = br.readLine().split(" ").map { it.toInt() }

        if(dot.containsKey(color))
            dot[color]!!.add(location)
        else{
            dot[color] = ArrayList()
            dot[color]!!.add(location)
        }
    }

    var result = 0
    dot.values.forEach {
        result += getLength(it.sorted())
    }
    bw.write("$result")

    bw.close()
    br.close()
}

fun getLength(arr : List<Int>) : Int{
    var sum = 0
    for(i in arr.indices){
        sum += when (i) {
            0 -> arr[i + 1] - arr[i]
            arr.size - 1 -> arr[i] - arr[i - 1]
            else -> min(arr[i] - arr[i - 1], arr[i + 1] - arr[i])
        }
    }

    return sum
}