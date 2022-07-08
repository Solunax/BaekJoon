import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val m = br.readLine().toInt()
    val input = br.readLine()

    var result = 0
    var pattern = 0
    var index = 1

    while(index < m - 1){
        if(input[index - 1] == 'I' && input[index] == 'O' && input[index + 1] == 'I'){
            pattern++
            if(pattern == n){
                pattern--
                result++
            }
            index++
        }else
            pattern = 0
        index++
    }

    bw.write("$result")

    bw.close()
    br.close()
}