import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var check = false
var num = br.readLine().toInt()
var minValue = Int.MAX_VALUE

fun main() {
    val input = num.toString().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toTypedArray()
    val len = input.size
    val visit = Array(len){false}

    getNumbers(StringBuilder(), input, visit, 0, len)

    if(check)
        bw.write("$minValue")
    else
        bw.write("0")

    bw.close()
    br.close()
}

fun getNumbers(sb : StringBuilder, number : Array<Int>, visit : Array<Boolean>, count : Int, len : Int){
    if(count == len){
        val temp = sb.toString().toInt()
        if(temp in (num + 1) until minValue){
            minValue = temp
            check = true
        }
        return
    }

    for(i in 0 until len){
        if(!visit[i]){
            visit[i] = true
            sb.append(number[i])
            getNumbers(sb, number, visit, count + 1, len)
            visit[i] = false
            sb.deleteCharAt(sb.length - 1)
        }
    }
}