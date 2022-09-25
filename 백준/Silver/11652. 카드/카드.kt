import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val map = HashMap<Long, Int>()

    repeat(n){
        val input = br.readLine().toLong()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    var result = 0L
    var max = Int.MIN_VALUE
    for(i in map.keys){
        if(map[i]!! > max){
            max = map[i]!!
            result = i
        }else if(map[i]!! == max)
            result = min(result, i)
    }

    bw.write("$result")

    bw.close()
    br.close()
}


