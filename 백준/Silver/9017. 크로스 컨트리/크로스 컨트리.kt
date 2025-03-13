import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val rank = br.readLine().split(" ").map { it.toInt() }
        val teamCount = HashMap<Int, Int>()

        for (i in 0 until n) {
            teamCount[rank[i]] = teamCount.getOrDefault(rank[i], 0) + 1
        }

        val five = IntArray(rank.max() + 1)
        val temp = HashMap<Int, Int>()
        val teamScore = HashMap<Int, Int>()
        var score = 1

        for (r in rank) {
            if (teamCount[r] == 6) {
                temp[r] = temp.getOrDefault(r, 0) + 1

                if (temp[r]!! <= 4) {
                    teamScore[r] = teamScore.getOrDefault(r, 0) + score
                }

                if (temp[r] == 5) {
                    five[r] = score
                }

                score++
            }
        }

        var result = 0
        var minScore = Int.MAX_VALUE
        var fiveScore = Int.MAX_VALUE

        for (key in teamScore.keys) {
            val t = teamScore[key]!!

            if (t < minScore) {
                result = key
                minScore = t
                fiveScore = five[key]
            } else if (minScore == t && fiveScore > five[key]) {
                result = key
            }
        }
        bw.write("$result\n")
    }

    bw.close()
    br.close()
}