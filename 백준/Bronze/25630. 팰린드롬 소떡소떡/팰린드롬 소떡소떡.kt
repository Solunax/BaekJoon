import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine().split("").filter { it.isNotEmpty() }
    var result = 0

    for(i in 0 until n / 2){
        if(input[i] != input[n - i - 1])
            result++
    }
    bw.write("$result")

    bw.close()
    br.close()
}