import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var dayCount = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

fun main() {
    val (startY, startM, startD) = br.readLine().split(" ").map{ it.toInt() }
    val (endY, endM, endD) = br.readLine().split(" ").map { it.toInt() }

    if(
        (endY - startY > 1000) ||
        (endY - startY == 1000 && endM > startM) ||
        (endY - startY == 1000 && endM == startM && endD >= startD)
    )
        bw.write("gg")
    else{
        val start = calcDay(startY, startM, startD)
        val end = calcDay(endY, endM, endD)

        bw.write("D-${end - start}")
    }

    br.close()
    bw.close()
}

fun calcDay(year : Int, month : Int, day : Int) : Int{
    var total = 0
    for(i in 1 until year){
        yearCheck(i)
        for(j in 0 until 12)
            total += dayCount[j]
    }

    yearCheck(year)
    for(i in 0 until month - 1)
        total += dayCount[i]

    return total + day
}

fun yearCheck(year : Int){
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
        dayCount[1] = 29
    }
    else
        dayCount[1] = 28
}