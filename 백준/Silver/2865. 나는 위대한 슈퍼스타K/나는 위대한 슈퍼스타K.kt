import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max
import kotlin.math.round

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m, k) = br.readLine().split(" ").map{ it.toInt() }
    val array = Array(n){ 0.0 }

    for(i in 0 until m){
        val input = StringTokenizer(br.readLine())
        for(j in 0 until n){
            val number = input.nextToken().toInt()
            val skill = input.nextToken().toDouble()
            array[number - 1] = max(skill, array[number - 1])
        }
    }
    array.sortDescending()

    var result = 0.0
    for(i in 0 until k)
        result += array[i]

    bw.write(String.format("%.1f", result))

    bw.close()
    br.close()
}