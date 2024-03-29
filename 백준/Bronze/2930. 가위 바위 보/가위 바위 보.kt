import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val sg = br.readLine()
    val k = br.readLine().toInt()
    val opponent = Array(k) { "" }

    repeat(k) {
        opponent[it] = br.readLine()
    }

    var score = 0
    for (i in 0 until n) {
        for (j in 0 until k) {
            score += getScore(sg[i], opponent[j][i])
        }
    }

    var best = 0
    for (i in 0 until n) {
        var r = 0
        var s = 0
        var p = 0

        for (j in 0 until k) {
            r += getScore('R', opponent[j][i])
            s += getScore('S', opponent[j][i])
            p += getScore('P', opponent[j][i])
        }

        best += maxOf(r, s, p)
    }
    bw.write("$score\n$best")

    bw.close()
    br.close()
}

fun getScore(sg: Char, fr: Char): Int {
    return if (sg == fr) {
        1
    } else {
        return when (sg) {
            'R' -> {
                if (fr == 'S') {
                    2
                } else {
                    0
                }
            }
            'S' -> {
                if (fr == 'P') {
                    2
                } else {
                    0
                }
            }
            'P' -> {
                if (fr == 'R') {
                    2
                } else {
                    0
                }
            }
            else -> 0
        }
    }
}