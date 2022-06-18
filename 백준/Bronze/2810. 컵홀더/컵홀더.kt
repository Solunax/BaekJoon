import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val numberOfSit = br.readLine().toInt()
    val input = br.readLine()
    val sb = StringBuilder()

    var coupleCount = 1
    sb.append("*")
    input.forEach {
        if(it == 'S'){
            sb.append(it)
            sb.append("*")
        } else if(it == 'L'){
            if(coupleCount == 2){
                coupleCount = 1
                sb.append(it)
                sb.append("*")
            }else{
                coupleCount++
                sb.append(it)
            }
        }
    }

    val cupHolder = sb.count{it == '*'}
    val result = if(cupHolder > numberOfSit)
        numberOfSit
    else
        cupHolder

    bw.write("$result")

    bw.close()
    br.close()
}
