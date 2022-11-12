import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val score = Array(n){0}

    val cards = Array(n){Array(m){0}}
    val maxCards = Array(m){0}
    repeat(n) {
        cards[it] = br.readLine().split(" ").map { v -> v.toInt() }.sortedDescending().toTypedArray()
    }

    for(i in 0 until m){
        var max = 0
        for(j in 0 until n){
            if(max < cards[j][i])
                max = cards[j][i]
        }

        maxCards[i] = max
    }

    for(i in 0 until m){
        for(j in 0 until n){
            if(maxCards[i] == cards[j][i])
                score[j]++
        }
    }

    var maxScore = 0
    for(i in 0 until n){
        if(maxScore < score[i])
            maxScore = score[i]
    }

    for(i in 0 until n){
        if(maxScore == score[i])
            bw.write("${i+1} ")
    }

    bw.close()
    br.close()
}