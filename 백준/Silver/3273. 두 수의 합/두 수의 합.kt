import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.sorted()
    val target = br.readLine().toInt()

    var left = 0
    var right = n-1
    var result = 0

    while(left < right){
        val sum = array[left] + array[right]

        if(sum == target)
            result++

        if(sum > target){
            right--
            left = 0
        }else
            left++
    }
    bw.write("$result")

    bw.close()
    br.close()
}