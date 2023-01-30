import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val n = br.readLine().toInt()
        var scoreP1 = 0
        var scoreP2 = 0

        repeat(n){
            val (p1, p2) = br.readLine().split(" ")

            if(p1 == "R" && p2 == "S")
                scoreP1++
            else if (p1 == "S" && p2 == "P")
                scoreP1++
            else if(p1 == "P" && p2 == "R")
                scoreP1++
            else if(p1 == "R" && p2 == "P")
                scoreP2++
            else if(p1 == "S" && p2 == "R")
                scoreP2++
            else if(p1 == "P" && p2 == "S")
                scoreP2++
        }

        if(scoreP1 > scoreP2)
            bw.write("Player 1\n")
        else if(scoreP1 < scoreP2)
            bw.write("Player 2\n")
        else
            bw.write("TIE\n")
    }

    br.close()
    bw.close()
}

