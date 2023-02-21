import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine()

    var result = 0
    for(i in 0 until n-1){
        if(input[i] == 'E' && input[i + 1] == 'W')
            result++
    }

    bw.write("$result")

    br.close()
    bw.close()
}