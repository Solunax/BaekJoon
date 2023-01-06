import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val meat = br.readLine().toInt()
    val target = br.readLine().toInt()
    val frozenTime = br.readLine().toInt()
    val defrostTime = br.readLine().toInt()
    val heatTime = br.readLine().toInt()

    val result : Int = if(meat < 0)
        (abs(meat) * frozenTime) + defrostTime + (target * heatTime)
    else
        (target - meat) * heatTime

    bw.write("$result")

    br.close()
    bw.close()
}