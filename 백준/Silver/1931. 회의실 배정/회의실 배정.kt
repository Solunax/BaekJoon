import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()
    val timeList = Array(case){Array(2){ 0 } }

    for(i in 0 until case){
        val input = br.readLine().split(" ").map { it.toInt() }
        timeList[i][0] = input[0]
        timeList[i][1] = input[1]
    }

    timeList.sortWith { o1, o2 ->
        if(o1[1] == o2[1])
            o1[0] - o2[0]
        else
            o1[1] - o2[1]
    }

    var result = 0
    var previousEndTime = 0

    for(i in 0 until case){
        if(previousEndTime <= timeList[i][0]){
            previousEndTime = timeList[i][1]
            result++
        }
    }
    bw.write("$result")

    br.close()
    bw.close()
}