import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split("").filter { it.isNotEmpty() }

    var last = input[0]
    var result = 1

    for(i in 1 until input.size){
        if(input[i] <= last)
            result++

        last = input[i]
    }

    bw.write("$result")
    bw.close()
    br.close()
}