import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var money = 1000 - br.readLine().toInt()
    val change = listOf(500, 100, 50, 10, 5, 1)

    var index = 0
    var count = 0

    while(money > 0){
        if(money / change[index] != 0){
            val temp = money / change[index]
            count += temp
            money -= temp * change[index]
        }
        index++
    }

    bw.write("$count")
    bw.close()
    br.close()
}