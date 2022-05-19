import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var result = 0L
    val numberOfCity = br.readLine().toInt()
    val distance = br.readLine().split(" ").map { it.toInt() }
    val price = br.readLine().split(" ").map { it.toInt() }

    var now = 0

    while(now < distance.size){
        val startLocation = now
        var movingDistance = 0L

        while(true){
            if(price[startLocation] > price[now] || now == distance.size){
                result += movingDistance * price[startLocation]
                break
            }else
                movingDistance += distance[now]
            now++
        }
    }

    bw.write("$result")

    br.close()
    bw.close()
}