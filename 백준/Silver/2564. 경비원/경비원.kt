import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (w, h) = br.readLine().split(" ").map { it.toInt() }
    val n = br.readLine().toInt()
    val spot = Array(n){0}
    var cop = 0

    for(i in 0 .. n){
        val (direction, distance) = br.readLine().split(" ").map { it.toInt() }
        val temp = when(direction){
            1 -> distance
            2 -> (w * 2) + h - distance
            3 -> (w * 2) + (2 * h) - distance
            else -> w + distance
        }

        if(i < n)
            spot[i] = temp
        else
            cop = temp
    }

    var result = 0
    val totalDistance = (w * 2) + (h * 2)
    repeat(n){
        val dis1 = abs(cop - spot[it])
        val dis2 = totalDistance - dis1
        result += min(dis1, dis2)
    }
    bw.write("$result")

    br.close()
    bw.close()
}