import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().split(" ").map{ it.toInt() }
    val b = br.readLine().split(" ").map{ it.toInt() }

    var scoreA = 0
    var scoreB = 0
    var lastWin = ""
    for(i in a.indices){
        if(a[i] > b[i]){
            scoreA += 3
            lastWin = "A"
        }
        else if(a[i] < b[i]){
            scoreB += 3
            lastWin = "B"
        }
        else{
            scoreA++
            scoreB++
        }
    }

    bw.write("$scoreA $scoreB\n")
    if(scoreA > scoreB)
        bw.write("A")
    else if(scoreB > scoreA)
        bw.write("B")
    else{
        if(lastWin == "")
            bw.write("D")
        else
            bw.write(lastWin)
    }

    br.close()
    bw.close()
}