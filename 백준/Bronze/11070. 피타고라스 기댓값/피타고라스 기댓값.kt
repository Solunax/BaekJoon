import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val(n, m) = br.readLine().split(" ").map { it.toInt() }
        val team = Array(n){Team(0, 0)}

        repeat(m){
            val(t1, t2, t1Score, t2Score) = br.readLine().split(" ").map { it.toInt() }

            team[t1-1].get += t1Score
            team[t1-1].loose += t2Score

            team[t2-1].get += t2Score
            team[t2-1].loose += t1Score
        }
        var maxResult = 0
        var minResult = Int.MAX_VALUE

        team.forEach {
            val score = if(it.get == 0 && it.loose == 0){
                0
            }else{
                val s = (it.get * it.get).toDouble()
                val a = (it.loose * it.loose).toDouble()

                (s / (s + a) * 1000).toInt()
            }
            
            maxResult = max(maxResult, score)
            minResult = min(minResult, score)
        }

        bw.write("$maxResult\n")
        bw.write("$minResult\n")
    }

    br.close()
    bw.close()
}

class Team(var get : Int, var  loose : Int)