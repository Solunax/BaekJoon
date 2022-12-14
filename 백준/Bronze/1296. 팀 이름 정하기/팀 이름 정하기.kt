import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val name = br.readLine()
    val n = br.readLine().toInt()
    val team = Array(n){""}
    var max = -1
    var winTeam = ""

    val l = name.count { it == 'L' }
    val o = name.count { it == 'O' }
    val v = name.count { it == 'V' }
    val e = name.count { it == 'E' }

    repeat(n){
        team[it] = br.readLine()
    }

    repeat(n){
        val counts = arrayOf(l, o, v, e)

        team[it].forEach { v ->
            when(v){
                'L' -> counts[0]++
                'O' -> counts[1]++
                'V' -> counts[2]++
                'E' -> counts[3]++
            }
        }

        var sum = 1
        for(i in 0 until 3){
            for(j in i+1 until 4)
                sum *= (counts[i] + counts[j])
        }
        val score = sum % 100

        if(max == score){
            winTeam = listOf(winTeam, team[it]).sorted()[0]
            if(winTeam == team[it])
                max = score
        }

        if(max < score){
            max = score
            winTeam = team[it]
        }
    }
    bw.write(winTeam)

    br.close()
    bw.close()
}