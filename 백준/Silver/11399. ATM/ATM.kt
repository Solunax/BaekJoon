import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val array = br.readLine().split(" ").map{ it.toInt() }.toMutableList()

    array.sort()
    var sum = array[0]
    var result = array[0]
    for(i in 1 until case){
        sum += array[i]
        result += sum
    }


    bw.write("$result")
    br.close()
    bw.close()
}