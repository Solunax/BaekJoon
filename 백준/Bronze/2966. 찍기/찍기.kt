import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val adr = listOf("A", "B", "C")
    val bru = listOf("B", "A", "B", "C")
    val gor = listOf("C", "C", "A", "A", "B", "B")

    br.readLine()
    val input = br.readLine().split("").filter { it.isNotEmpty() }.toTypedArray()

    val adrScore = getScore(adr, input)
    val bruScore = getScore(bru, input)
    val gorScore = getScore(gor, input)

    val maxScore = max(adrScore, max(bruScore, gorScore))
    bw.write("$maxScore\n")

    if(adrScore == maxScore)
        bw.write("Adrian\n")

    if(bruScore == maxScore)
        bw.write("Bruno\n")

    if(gorScore == maxScore)
        bw.write("Goran\n")

    br.close()
    bw.close()
}

fun getScore(pattern : List<String>, input : Array<String>) : Int{
    val maxLen = pattern.size
    var index = 0
    var score = 0

    for(i in input.indices){
        if(input[i] == pattern[index])
            score++

        index++
        if(index == maxLen)
            index = 0
    }


    return score
}