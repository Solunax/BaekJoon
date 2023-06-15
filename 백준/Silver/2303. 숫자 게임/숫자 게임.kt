import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val card = Array(n){ List(5){0} }
    val maxScore = Array(n){0}

    repeat(n){
        card[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    repeat(n){
        maxScore[it] = getResult(card[it])
    }

    var maxValue = 0
    var maxIndex = 0
    for(i in 0 until n){
        if(maxScore[i] >= maxValue){
            maxValue = maxScore[i]
            maxIndex = i + 1
        }
    }

    bw.write("$maxIndex")

    bw.close()
    br.close()
}

fun getResult(list : List<Int>) : Int{
    var maxValue = 0
    for(i in 0 until 5){
        for(j in i + 1 until 5){
            for(k in j + 1 until 5)
                maxValue = max(((list[i] + list[j] + list[k]).toString().last() - '0'), maxValue)
        }
    }

    return maxValue
}