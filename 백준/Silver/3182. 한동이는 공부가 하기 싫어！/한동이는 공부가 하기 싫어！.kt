import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Int>
lateinit var visit: BooleanArray
lateinit var result: IntArray
var n = 0

fun main() {
    n = br.readLine().toInt()
    map = Array(n + 1) { 0 }
    result = IntArray(n + 1)
    var maxValue = Int.MIN_VALUE

    repeat(n) {
        map[it + 1] = br.readLine().toInt()
    }

    for (i in 1..n) {
        visit = BooleanArray(n + 1)
        search(i)
        result[i] = visit.count { it }
        maxValue = max(maxValue, result[i])
    }
    bw.write("${result.indexOf(maxValue)}")

    bw.close()
    br.close()
}

fun search(idx: Int) {
    visit[idx] = true
    if (!visit[map[idx]]) {
        search(map[idx])
    }
}