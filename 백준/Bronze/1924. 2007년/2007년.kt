import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val date = listOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
    val cal = Array(13){Array(32){""}}

    var dateIndex = 0
    for(i in 1..12){
        when(i){
            1, 3, 5, 7, 8, 10, 12 -> {
                for(j in 1 .. 31){
                    cal[i][j] = date[dateIndex++]
                    if(dateIndex > 6)
                        dateIndex = 0
                }
            }
            4, 6, 9, 11 -> {
                for(j in 1 .. 30){
                    cal[i][j] = date[dateIndex++]
                    if(dateIndex > 6)
                        dateIndex = 0
                }
            }
            2 -> {
                for(j in 1 .. 28){
                    cal[i][j] = date[dateIndex++]
                    if(dateIndex > 6)
                        dateIndex = 0
                }
            }
        }
    }

    val (month, day) = br.readLine().split(" ").map { it.toInt() }
    bw.write(cal[month][day])

    bw.close()
    br.close()
}