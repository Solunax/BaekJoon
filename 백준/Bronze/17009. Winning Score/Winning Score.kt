import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val team = Array(2){0}

    repeat(2){
        var score = 0
        for(i in 3 downTo 1)
            score += br.readLine().toInt() * i

        team[it] = score
    }

    if(team[0] > team[1])
        bw.write("A")
    else if(team[0] < team[1])
        bw.write("B")
    else
        bw.write("T")

    bw.close()
    br.close()
}