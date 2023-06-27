import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    repeat(br.readLine().toInt()){
        val input = br.readLine().split(" ").map { it.toInt() }
        val (x1, y1, r1) = Triple(input[0], input[1], input[2])
        val (x2, y2, r2) = Triple(input[3], input[4], input[5])

        if(x1 == x2 && y1 == y2 && r1 == r2)
            println(-1)
        else{
            val a = abs(x1 - x2)
            val b = abs(y1 - y2)
            val distance = sqrt((a * a).toDouble() + (b * b).toDouble())

            val big = if(r1 > r2)
                r1
            else
                r2

            val small = if(r1 > r2)
                r2
            else
                r1

            if(big - small < distance && distance < big + small)
                println(2)
            else if((big + small).toDouble() == distance || (big - small).toDouble() == distance)
                println(1)
            else if(big + small < distance || distance < big - small)
                println(0)
            else
                println(-1)
        }
    }

    bw.close()
    br.close()
}