import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val score = Array(6){0}

    repeat(6){
        score[it] = br.readLine().toInt()
    }

    val sci = score.copyOfRange(0, 4).sortedDescending()
    val soc = score.copyOfRange(4, 6).sortedDescending()

    var sum = 0

    for(i in 0 until 3)
        sum += sci[i]

    sum += soc[0]
    bw.write("$sum")

    br.close()
    bw.close()
}
