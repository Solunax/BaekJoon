import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val n = br.readLine().toInt()
val checkPoint = Array(n){ Array(2){0} }

fun main() {
    repeat(n){
        checkPoint[it] = br.readLine().split(" ").map { v -> v.toInt() }.toTypedArray()
    }

    var sum = 0
    for(i in 0 until n-1)
        sum += getDistance(i, i + 1)

    var result = sum
    for(i in 1 until n - 1){
        val skip = sum - (getDistance(i, i - 1) + getDistance(i, i + 1)) + getDistance(i - 1, i + 1)

        result = min(result, skip)
    }

    bw.write("$result")

    bw.close()
    br.close()
}

fun getDistance(v1 : Int, v2 : Int) : Int{
    return abs(checkPoint[v1][0] - checkPoint[v2][0]) + abs(checkPoint[v1][1] - checkPoint[v2][1])
}