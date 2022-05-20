import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Math.pow
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val case = br.readLine().toInt()

    for(i in 0 until case){
        val input = br.readLine().split(" ").map { it.toInt() }
        val (startX, startY) = Pair(input[0], input[1])
        val (endX, endY) = Pair(input[2], input[3])

        val numberOfPlanet = br.readLine().toInt()

        var result = 0
        for(i in 0 until numberOfPlanet){
            val (planetX, planetY, radius) = br.readLine().split(" ").map { it.toInt() }
            var start = false
            var end = false
            
            if(radius * radius >= pow((planetX - startX).toDouble(), 2.0) + pow((planetY - startY).toDouble(), 2.0))
                start = true

            if(radius * radius >= pow((planetX - endX).toDouble(), 2.0) + pow((planetY - endY).toDouble(), 2.0))
                end = true

            if(start != end)
                result++
        }

        bw.write("$result\n")
    }

    br.close()
    bw.close()
}