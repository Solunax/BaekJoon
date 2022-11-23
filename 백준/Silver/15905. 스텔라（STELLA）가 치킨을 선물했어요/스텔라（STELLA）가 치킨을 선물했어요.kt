import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val score = Array(n){Pair(0, 0)}

    repeat(n){
        val (solved, p) = br.readLine().split(" ").map { v -> v.toInt() }
        score[it] = Pair(solved, p)
    }

    if(n == 5)
        bw.write("0")
    else{
        score.sortWith{ o1, o2 ->
            if(o1.first == o2.first)
                o1.second - o2.second
            else
                o2.first - o1.first
        }

        val target = score[4].first
        var result = 0
        for(i in 5 until n){
            if(score[i].first == target)
                result++
            else
                break
        }
        bw.write("$result")
    }

    bw.close()
    br.close()
}