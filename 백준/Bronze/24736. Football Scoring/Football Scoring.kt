import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val score = listOf(6, 3, 2, 1, 2)
    val team = IntArray(2)

    repeat(2) {
        val input = br.readLine().trim().split(" ").map { v -> v.toInt() }

        for (i in 0 until 5) {
            team[it] += input[i] * score[i]
        }
    }
    
    bw.write(team.joinToString(" "))

    bw.close()
    br.close()
}