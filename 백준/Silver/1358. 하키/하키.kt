import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    val width = input[0]
    val height = input[1]
    val pointX = input[2]
    val pointY = input[3]
    val numberOfPerson = input[4]

    val radius = height / 2
    val circle2X = pointX + width
    val circleY = pointY + radius

    var result = 0
    for(i in 0 until numberOfPerson){
        val (personX, personY) = br.readLine().split(" ").map { it.toInt() }
        var inside = false

        if(radius * radius >= (pointX - personX).toDouble().pow(2.0) + (circleY - personY).toDouble().pow(2.0))
            inside = true
        else if(radius * radius >= (circle2X - personX).toDouble().pow(2.0) + (circleY - personY).toDouble().pow(2.0))
            inside = true
        else if(personX in pointX..circle2X && personY in pointY .. pointY + height)
            inside = true
        
        if(inside)
            result++
    }
    bw.write("$result\n")

    br.close()
    bw.close()
}