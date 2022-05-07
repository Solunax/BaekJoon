import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min
import kotlin.system.exitProcess

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val input = br.readLine().toInt()

var array = Array(input){Array(input){ 0 } }
var team = Array(input){false}

var minValue = Integer.MAX_VALUE

fun main() {
    for(i in 0 until input)
        array[i] = br.readLine().split(" ").map{ it.toInt() }.toTypedArray()

    solve(0, 0)
    bw.write("$minValue")
    br.close()
    bw.close()
}

fun solve(index:Int, count:Int){
    if(count == input / 2){
        var t1 = 0
        var t2 = 0

        for(i in 0 until input){
            for(j in i + 1 until input){
                if(team[i] && team[j]){
                    t1 += array[i][j]
                    t1 += array[j][i]
                }else if(!team[i] && !team[j]){
                    t2 += array[i][j]
                    t2 += array[j][i]
                }
            }
        }

        val dif = abs(t1 - t2)
        minValue = min(minValue, dif)
        return
    }

    for(i in index until  input){
        if(!team[i]){
            team[i] = true
            solve(i + 1, count + 1)
            team[i] = false
        }
    }
}