import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val answer = Array(8){0}
    repeat(8){
        answer[it] = br.readLine().toInt()
    }

    val sortedAnswer = answer.sortedDescending()
    var sum = 0
    for(i in 0 until 5)
        sum += sortedAnswer[i]
    bw.write("$sum\n")

    for(i in 0 until 8){
        if(answer[i] >= sortedAnswer[4])
            bw.write("${i + 1} ")
    }

    bw.close()
    br.close()
}