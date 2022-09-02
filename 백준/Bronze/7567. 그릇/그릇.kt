import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }

    var result = 10
    for(i in 1 until input.size){
        result += if(input[i - 1] == input[i])
            5
        else
            10
    }

    bw.write("$result")
    bw.close()
    br.close()
}