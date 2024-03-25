import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val balls = br.readLine()
    var result = Int.MAX_VALUE
    val red = balls.count { it == 'R' }
    val blue = n - red

    var count = 0
    for (i in 0 until n) {
        if (balls[i] == 'R') {
            count++
        } else {
            break
        }
    }
    result = min(result, red - count)

    count = 0
    for (i in 0 until n) {
        if (balls[i] == 'B') {
            count++
        } else {
            break
        }
    }
    result = min(result, blue - count)

    count = 0
    for (i in n - 1 downTo 0) {
        if (balls[i] == 'R') {
            count++
        } else {
            break
        }
    }
    result = min(result, red - count)

    count = 0
    for (i in n - 1 downTo 0) {
        if (balls[i] == 'B') {
            count++
        } else {
            break
        }
    }
    result = min(result, blue - count)

    bw.write("$result")

    bw.close()
    br.close()
}