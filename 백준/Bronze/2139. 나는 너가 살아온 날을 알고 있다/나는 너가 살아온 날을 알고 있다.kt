import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val monthDay = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    while (true) {
        val (targetDay, targetMonth, targetYear) = br.readLine().split(" ").map { it.toInt() }

        if (targetYear == 0 && targetMonth == 0 && targetDay == 0) {
            break
        }

        var month = 1
        var day = 1

        monthDay[2] = if (targetYear % 4 == 0 && targetYear % 100 != 0 || targetYear % 400 == 0) {
            29
        } else {
            28
        }

        var dateCount = 1
        while (month != targetMonth || day != targetDay) {
            dateCount++
            day++
            if (day > monthDay[month]) {
                month++
                day = 1
            }
        }

        bw.write("$dateCount\n")
    }

    bw.close()
    br.close()
}