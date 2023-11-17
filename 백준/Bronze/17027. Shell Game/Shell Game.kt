import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val data = Array(n){ Triple(0, 0 , 0) }

    repeat(n) {
        val input = br.readLine().split(" ").map { v -> v.toInt() }
        data[it] = Triple(input[0], input[1], input[2])
    }

    var maxScore = 0
    for(i in 1 .. 3) {
        var answer = i
        var score = 0

        for(d in data) {
            if (answer == d.first) {
                answer = d.second
            } else if (answer == d.second) {
                answer = d.first
            }

            if (answer == d.third){
                score++
            }
        }

        maxScore = max(score, maxScore)
    }
    bw.write("$maxScore")

    bw.close()
    br.close()
}