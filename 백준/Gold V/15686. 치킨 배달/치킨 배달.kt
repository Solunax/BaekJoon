import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

val chicken = ArrayList<Pair<Int, Int>>()
val house = ArrayList<Pair<Int, Int>>()
lateinit var visit: Array<Boolean>
var n = 0
var m = 0
var result = Int.MAX_VALUE

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]

    repeat(n) { x ->
        val temp = br.readLine().split(" ").map { it.toInt() }

        for (i in 0 until n) {
            when (temp[i]) {
                1 -> house.add(Pair(x, i))
                2 -> chicken.add(Pair(x, i))
            }
        }
    }

    visit = Array(chicken.size) { false }
    search(0, 0)
    bw.write("$result")

    bw.close()
    br.close()
}

fun search(start: Int, count: Int) {
    if (count == m) {
        var distanceTotal = 0

        for (i in 0 until house.size) {
            var temp = Int.MAX_VALUE

            for (j in 0 until chicken.size) {
                if (visit[j]) {
                    val distance = abs(house[i].first - chicken[j].first) + abs(house[i].second - chicken[j].second)
                    temp = min(temp, distance)
                }
            }

            distanceTotal += temp
        }

        result = min(result, distanceTotal)
        return
    }

    for (i in start until chicken.size) {
        visit[i] = true
        search(i + 1, count + 1)
        visit[i] = false
    }
}