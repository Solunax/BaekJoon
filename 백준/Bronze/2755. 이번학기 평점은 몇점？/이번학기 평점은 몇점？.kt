import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    var scoreSum = 0.0
    var sum = 0
    repeat(n){
        val (_, s, rank) = br.readLine().split(" ")
        val temp = when(rank){
            "A+" -> 4.3
            "A0" -> 4.0
            "A-" -> 3.7
            "B+" -> 3.3
            "B0" -> 3.0
            "B-" -> 2.7
            "C+" -> 2.3
            "C0" -> 2.0
            "C-" -> 1.7
            "D+" -> 1.3
            "D0" -> 1.0
            "D-" -> 0.7
            "F" -> 0.0
            else -> 0.0
        }

        sum += s.toInt()
        scoreSum += temp * s.toDouble()
    }
    bw.write("%.2f".format(scoreSum / sum))

    bw.close()
    br.close()
}