import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val (n, k, t, m) = br.readLine().split(" ").map { it.toInt() }
        val arr = ArrayList<Team>()

        repeat(n) {
            arr.add(Team(it + 1, k + 1))
        }

        repeat(m) {
            val (id, j, score) = br.readLine().split(" ").map { v -> v.toInt() }
            arr[id - 1].solveProblem(j, it + 1, score)
        }

        arr.forEach {
            it.checkScore()
        }

        arr.sortWith { o1, o2 ->
            if (o1.score != o2.score) {
                o2.score - o1.score
            } else {
                if (o1.submitCount != o2.submitCount) {
                    o1.submitCount - o2.submitCount
                } else {
                    o1.lastSubmit - o2.lastSubmit
                }
            }
        }

        var count = 0
        while (true) {
            if (arr[count].id != t) {
                count++
            } else {
                break
            }
        }

        bw.write("${count + 1}\n")
    }

    bw.close()
    br.close()
}

class Team(val id: Int, count: Int) {
    var score = 0
    var submitCount = 0
    var lastSubmit = 0
    private val solveResult = Array(count + 1) { 0 }

    fun solveProblem(idx: Int, last: Int, solveScore: Int) {
        submitCount++
        lastSubmit = last
        solveResult[idx] = max(solveResult[idx], solveScore)
    }

    fun checkScore() {
        solveResult.forEach {
            score += it
        }
    }
}