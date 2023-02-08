import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    br.readLine()
    val input = br.readLine().split(" ").map{ it.toInt() }

    var result = input[0]
    for(i in 1 until input.size){
        if(input[i] != (input[i-1]+1))
            result += input[i]
    }

    bw.write("$result")

    br.close()
    bw.close()
}