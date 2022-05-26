import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, c) = br.readLine().split(" ").map { it.toInt() }
    val housePosition = Array(n){0}

    for(i in 0 until n)
        housePosition[i] = br.readLine().toInt()
    housePosition.sort()

    var low = 1
    var high = housePosition[n - 1] - housePosition[0] + 1

    while(low < high){
        val center = (high + low) / 2

        var count = 1
        var lastLocation = housePosition[0]

        for(i in 1 until housePosition.size){
            val nowLocation = housePosition[i]

            if(nowLocation - lastLocation >= center){
                count++
                lastLocation = nowLocation
            }
        }

        if(count < c)
            high = center
        else
            low = center + 1
    }

    bw.write("${low - 1}")

    br.close()
    bw.close()
}