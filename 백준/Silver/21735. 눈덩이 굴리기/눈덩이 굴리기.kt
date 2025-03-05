import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var yard: List<Int>
var n = 0
var m = 0
var result = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    yard = listOf(0) + br.readLine().split(" ").map { it.toInt() }

    makeSnowBall(1, 0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun makeSnowBall(size: Int, time: Int, idx: Int) {
    if (time > m) {
        return
    }
    
    if (time <= m) {
        result = max(result, size)
    }

    if (idx + 1 <= n) {
        makeSnowBall(size + yard[idx + 1], time + 1, idx + 1)
    }

    if (idx + 2 <= n) {
        makeSnowBall(size / 2 + yard[idx + 2], time + 1, idx + 2)
    }
}