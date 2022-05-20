import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.math.min
import kotlin.math.sqrt

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (numberOfMatchstick, width, height) = br.readLine().split(" ").map { it.toInt() }

    val diagonal = sqrt((width * width).toDouble() + (height * height).toDouble())

    for(i in 0 until numberOfMatchstick){
        if(br.readLine().toInt() <= diagonal)
            bw.write("DA\n")
        else
            bw.write("NE\n")
    }

    br.close()
    bw.close()
}