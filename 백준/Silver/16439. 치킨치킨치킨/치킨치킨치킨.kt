import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var chicken: Array<IntArray>
lateinit var visit: BooleanArray
var n = 0
var m = 0
var result = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    chicken = Array(n) { IntArray(m) }
    visit = BooleanArray(m)

    repeat(n) {
        val like = br.readLine().split(" ").map { v -> v.toInt() }

        for (i in 0 until m) {
            chicken[it][i] = like[i]
        }
    }

    search(0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(s: Int, d: Int) {
    if (d == 3) {
        var sum = 0

        for (i in 0 until n) {
            var temp = 0

            for (j in 0 until m) {
                if (visit[j]) {
                    temp = max(temp, chicken[i][j])
                }
            }
            sum += temp
        }

        result = max(result, sum)
        return
    }

    for (i in s until m) {
        if (!visit[i]) {
            visit[i] = true
            search(i + 1, d + 1)
            visit[i] = false
        }
    }
}