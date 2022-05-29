import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val input = br.readLine().split(" ").map { it.toInt() }.toMutableList()
    val sum = Array(case){0}

    sum[0] = input[0]
    for(i in 1 until  case){
        if(sum[i - 1] + input[i] > input[i])
            sum[i] = sum[i - 1] + input[i]
        else
            sum[i] = input[i]
    }
    
    sum.sort()
    bw.write("${sum.last()}")

    br.close()
    bw.close()
}