import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().split(" ").map{ it.toInt() }
var array = Array(input[0] + 1){0}
var sumArray = ArrayList<Int>()

fun main() {
    array[0] = 0
    array = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()
    sumArray.add(0)
    var sum = 0

    for(i in 0 until  input[0]){
        sum += array[i]
        sumArray.add(sum)
    }

    for(i in 0 until input[1]){
        val section = br.readLine().split(" ").map { it.toInt() }
        
        bw.write("${sumArray[section[1]] - sumArray[section[0] - 1]}\n")
        bw.flush()
    }

    br.close()
    bw.close()
}
