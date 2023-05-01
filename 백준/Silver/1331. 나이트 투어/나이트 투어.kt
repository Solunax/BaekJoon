import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val visit = ArrayList<String>()
    val temp = br.readLine()
    val startX = temp[0].code
    val startY = temp[1].code
    var previousX = startX
    var previousY = startY
    var nowX = 0
    var nowY = 0
    var flag = true

    for(i in 0 until 35){
        val input = br.readLine()
        nowX = input[0].code
        nowY = input[1].code

        if(visit.contains(input)){
            flag = false
            break
        }

        if(abs(nowX - previousX) == 2 && abs(nowY - previousY) == 1 ||
            abs(nowX - previousX) == 1 && abs(nowY - previousY) == 2){
            visit.add(input)
            previousX = nowX
            previousY = nowY
        }else{
            flag = false
            break
        }
    }

    if(flag){
        if(abs(nowX - startX) == 2 && abs(nowY - startY) == 1 ||
            abs(nowX - startX) == 1 && abs(nowY - startY) == 2){
            bw.write("Valid")
        }
        else
            bw.write("Invalid")

    }else
        bw.write("Invalid")

    bw.close()
    br.close()
}