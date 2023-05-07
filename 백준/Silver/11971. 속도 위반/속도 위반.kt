import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val maxSpeed = Array(100){0}
    val yeon = Array(100){0}
    var index = 0

    repeat(n){
        val (length, speed) = br.readLine().split(" ").map { it.toInt() }

        for(i in 0 until length)
            maxSpeed[index++] = speed
    }

    index = 0
    repeat(m){
        val (length, speed) = br.readLine().split(" ").map { it.toInt() }

        for(i in 0 until length)
            yeon[index++] = speed
    }

    var result = 0
    for(i in 0 until 100)
        result = max(yeon[i] - maxSpeed[i], result)

    bw.write("$result")

    bw.close()
    br.close()
}