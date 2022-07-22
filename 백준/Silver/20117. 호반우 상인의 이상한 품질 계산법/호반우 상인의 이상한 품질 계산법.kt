import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    array.sort()

    var result = 0
    if(n % 2 == 0){
        for(i in 0 until n / 2)
            result += array.removeLast() * 2
    }
    else{
        result = array[n / 2]
        for(i in 0 until n / 2)
            result += array.removeLast() * 2
    }

    bw.write("$result")
    bw.close()
    br.close()
}