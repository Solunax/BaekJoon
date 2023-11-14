import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var maxStreak = 0
    var nowStreak = 0

    br.readLine()
    br.readLine().split(" ").map { it.toInt() }.forEach { n ->
        if (n != 0) {
            nowStreak++
        } else {
            maxStreak = max(maxStreak, nowStreak)
            nowStreak = 0
        }
    }

    maxStreak = max(maxStreak, nowStreak)
    bw.write("$maxStreak")

    bw.close()
    br.close()
}