import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, d) = br.readLine().split(" ").map { it.toInt() }
    val distance = Array(10001) { Int.MAX_VALUE }
    val shortcut = Array(10001) { ArrayList<Pair<Int, Int>>() }

    repeat(n) {
        val (s, e, length) = br.readLine().split(" ").map { it.toInt() }

        if (e - s > length) {
            shortcut[e].add(Pair(s, length))
        }
    }

    distance[0] = 0
    for (i in 1..d) {
        if (shortcut[i].size > 0) {
            for (s in shortcut[i]) {
                if (distance[s.first] + s.second < distance[i]) {
                    distance[i] = min(distance[i - 1] + 1, distance[s.first] + s.second)
                }
            }
        } else {
            distance[i] = distance[i - 1] + 1
        }
    }
    bw.write("${distance[d]}")

    bw.close()
    br.close()
}