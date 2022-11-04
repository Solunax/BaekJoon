import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val input = br.readLine()

    var sum = 0L
    val sb = StringBuilder()

    for(i in 0 until n){
        if(input[i] in '0' .. '9'){
            if(sb.length < 7)
                sb.append(input[i])
            else
                sb.clear()
        }else{
            if(sb.isNotEmpty()){
                sum += sb.toString().toLong()
                sb.clear()
            }
        }
    }

    if(sb.isNotEmpty())
        sum += sb.toString().toLong()

    bw.write("$sum")
    bw.close()
    br.close()
}