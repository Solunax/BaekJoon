import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val status = arrayOfNulls<Status>(n)
    val winCount = Array(n) { IntArray(2) }

    repeat(n) {
        val (p, b) = br.readLine().split(" ").map { v -> v.toInt() }
        status[it] = Status(p, b)
        winCount[it][0] = it + 1
    }


    for (a in 0 until n) {
        for (b in a + 1 until n) {
            if (fight(status[a]!!, status[b]!!)) {
                winCount[a][1]++
            } else {
                winCount[b][1]++
            }
        }
    }
    winCount.sortByDescending { it[1] }

    repeat(n) {
        bw.write("${winCount[it][0]}\n")
    }

    bw.close()
    br.close()
}

fun fight(p1: Status, p2: Status): Boolean {
    val v1 = p1.power + p2.power * p1.band
    val v2 = p2.power + p1.power * p2.band

    return v1 > v2
}

class Status(val power: Int, val band: Int)