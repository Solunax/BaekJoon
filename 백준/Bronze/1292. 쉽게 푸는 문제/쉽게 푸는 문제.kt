import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val array = Array(m + 1){0}
    val sum = Array(m + 1){0}

    var v = 1
    var count = 0
    for(i in 1 .. m){
        array[i] = v
        sum[i] = v + sum[i - 1]
        count++

        if(v == count){
            count = 0
            v++
        }
    }
    
    bw.write("${sum[m] - sum[n - 1]}")

    bw.close()
    br.close()
}