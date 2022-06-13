import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val arraySize = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    array.sort()

    var sum = 0
    for(i in 0 until arraySize){
        if(array[i] > sum + 1)
            break

        sum += array[i]
    }
    
    bw.write("${sum + 1}")

    bw.close()
    br.close()
}
