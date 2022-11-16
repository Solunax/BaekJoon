import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val b1 = br.readLine().split(" ").map{ it.toInt() }
    val b2 = br.readLine().split(" ").map{ it.toInt() }

    var score1 = 0
    var score2 = 0
    var isWin = false

    for(i in b1.indices){
        score1 += b1[i]
        if(score1 > score2)
            isWin = true

        score2 += b2[i]
    }

    if(isWin)
        bw.write("Yes")
    else
        bw.write("No")

    bw.close()
    br.close()
}

