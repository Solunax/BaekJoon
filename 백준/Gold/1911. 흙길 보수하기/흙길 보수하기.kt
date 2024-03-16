import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, l) = br.readLine().split(" ").map { it.toInt() }
    val pool = Array(n) { Pair(0, 0) }

    repeat(n) {
        val (s, e) = br.readLine().split(" ").map { it.toInt() }
        pool[it] = Pair(s, e)
    }

    pool.sortWith { o1, o2 ->
        if (o1.first == o2.first) {
            o1.second - o2.second
        } else {
            o1.first - o2.first
        }
    }

    var result = 0
    var now = 0
    for (location in pool) {
        if (location.first > now) {
            now = location.first
        }

        if (now < location.second) {
            while (now < location.second) {
                now += l
                result++
            }
        }
    }

    bw.write("$result")

    bw.close()
    br.close()
}