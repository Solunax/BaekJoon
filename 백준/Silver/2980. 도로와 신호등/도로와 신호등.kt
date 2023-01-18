import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, l) = br.readLine().split(" ").map { it.toInt() }
    val light = ArrayList<Light>()

    repeat(n){
        val input = br.readLine().split(" ").map { it.toInt() }
        light.add(Light(input[0], input[1], input[2]))
    }

    var time = 0
    for(i in 0 until n){
        time += if(i == 0)
            light[i].loc
        else
            light[i].loc - light[i-1].loc

        val signalTime = light[i].red + light[i].green
        val term = time / signalTime
        val temp = time - (term * signalTime)

        if(temp < light[i].red)
            time += (light[i].red - temp)
    }

    time += (l - light.last().loc)
    bw.write("$time")

    br.close()
    bw.close()
}

class Light(val loc : Int, val red : Int, val green : Int)