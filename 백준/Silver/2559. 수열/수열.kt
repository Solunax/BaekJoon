import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().split(" ").map{ it.toInt() }
var array = Array(input[0]){0}
var max = 0

fun main() {
    array = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()

    for(i in 0 .. input[0] - input[1]){
        var sum = array[i]
        for(j in i + 1 until  i + input[1])
            sum += array[j]
        max = when(i){
            0 -> sum
            else -> max(sum, max)
        }
    }

    bw.write("$max")
    bw.flush()

    br.close()
    bw.close()
}