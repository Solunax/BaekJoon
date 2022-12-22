import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main(){
    val sb = StringBuilder()
    while(true){
        val input = br.readLine()

        if(input.isNullOrEmpty())
            break

        sb.append(input)
    }

    var sum = 0
    sb.toString().split(",").filter { it.isNotEmpty() }.forEach {
        sum += it.toInt()
    }

    bw.write("$sum")

    bw.close()
    br.close()
}