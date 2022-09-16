import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var (h, m, s) = br.readLine().split(":").map { it.toInt() }
    val (wh, wm, ws) = br.readLine().split(":").map { it.toInt() }

    if(h==wh && m == wm && s == ws)
        bw.write("24:00:00")
    else{
        var resH = 0
        var resM = 0

        val resS = if(s > ws){
            m++
            60 - s + ws
        }else{
            ws - s
        }

        resM += if(m > wm){
            h++
            60 - m + wm
        }else
            wm - m

        resH += if(h > wh){
            24 - h + wh
        }else
            wh - h

        bw.write("%02d:%02d:%02d".format(resH, resM, resS))
    }
    
    bw.close()
    br.close()
}