import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val a = br.readLine().split(" ").map { it.toInt() }
    val b = br.readLine().split(" ").map { it.toInt() }
    var aWin = 0
    var bWin = 0

    for(i in 0 until 10){
        if(a[i] > b[i])
            aWin++
        else if(a[i] < b[i])
            bWin++
    }

    if(aWin > bWin)
        bw.write("A")
    else if(aWin < bWin)
        bw.write("B")
    else
        bw.write("D")

    br.close()
    bw.close()
}
