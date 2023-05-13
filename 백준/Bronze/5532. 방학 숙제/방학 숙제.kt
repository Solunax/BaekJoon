import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val maxDay = br.readLine().toInt()
    val kor = br.readLine().toInt()
    val math = br.readLine().toInt()
    val korDay = br.readLine().toInt()
    val mathDay = br.readLine().toInt()

    val korReq = if(kor % korDay == 0)
        kor / korDay
    else
        kor / korDay + 1

    val mathReq = if(math % mathDay == 0)
        math / mathDay
    else
        math / mathDay + 1

    bw.write("${maxDay - max(korReq, mathReq)}")

    bw.close()
    br.close()
}