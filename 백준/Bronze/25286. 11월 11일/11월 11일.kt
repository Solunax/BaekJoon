import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val monthDay = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    repeat(br.readLine().toInt()) {
        var (year, month) = br.readLine().split(" ").map { it.toInt() }
        var date = month
        var count = month

        while (count != 0) {
            monthDay[2] = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                29
            } else {
                28
            }

            date--
            if (date == 0) {
                month--

                if (month != 0) {
                    date = monthDay[month]
                } else {
                    month = 12
                    year--
                    date = monthDay[month]
                }
            }
            count--
        }

        bw.write("$year $month $date\n")
    }

    bw.close()
    br.close()
}