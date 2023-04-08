import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val monthData = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
val days = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

fun main() {
    val (m, d, y, t) = br.readLine().split(" ")
    val year = y.toInt()
    val yearCheck = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
    val month = monthData.indexOf(m)
    val date = d.split(",")[0].toInt()

    var daySum = 0
    for(i in 0 until month){
        if(yearCheck && i == 1){
            daySum += 29
            continue
        }
        daySum += days[i]
    }

    daySum += (date - 1)

    val (hour, minute) = t.split(":").map { it.toInt() }
    val time = hour * 60 + minute
    val now = 60.0 * 24 * daySum + time
    val total : Double = if(yearCheck)
        366.0 * 60 * 24
    else
        365.0 * 60 * 24

    bw.write("${now * 100 / total}")

    br.close()
    bw.close()
}