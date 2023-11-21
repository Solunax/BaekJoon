import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val monthDate = arrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var year = 2014
    var month = 4
    var date = 2
    var addDay = br.readLine().toInt() - 1

    while (addDay != 0) {
        monthDate[2] = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
             29
        } else {
            28
        }

        if (date > monthDate[month]) {
            month++
            date = 1
        }

        if (month > 12) {
            year++
            month = 1
        }

        addDay--
        date++
    }
    
    if (date > monthDate[month]) {
        month++
        date = 1
    }

    if (month > 12) {
        year++
        month = 1
    }

    bw.write("%04d-%02d-%02d".format(year, month, date))

    bw.close()
    br.close()
}