import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.toTypedArray()
    array.sort()

    var start = 0
    var end = array.size - 1
    var v1 = 0
    var v2 = 0
    var dif = Integer.MAX_VALUE
    var sum : Int

    while(start < end){
        sum = array[start] + array[end]

        if(dif > abs(sum)){
            dif = abs(sum)
            v1 = array[start]
            v2 = array[end]
        }

        if(sum > 0)
            end--
        else
            start++
    }

    bw.write("$v1 $v2")

    bw.close()
    br.close()
}