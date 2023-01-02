import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (bYear, bMonth, bDate) = br.readLine().split(" ").map{it.toInt()}
    val (nYear, nMonth, nDate) = br.readLine().split(" ").map{it.toInt()}

    val yearDif = nYear - bYear
    val count = 1 + yearDif

    val man = if(yearDif == 0)
        0
    else{
        if(nMonth > bMonth)
            yearDif
        else{
            if(nMonth == bMonth && nDate >= bDate)
                yearDif
            else
                yearDif-1
        }
    }

    bw.write("$man\n$count\n$yearDif")
    br.close()
    bw.close()
}