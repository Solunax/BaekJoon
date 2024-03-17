import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.PriorityQueue

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val schedule = Array(n) { Pair(0, 0) }

    repeat(n) {
        val (s, e) = br.readLine().split(" ").map { v -> v.toInt() }
        schedule[it] = Pair(s, e)
    }

    schedule.sortWith { o1, o2 ->
        if (o1.first != o2.first) {
            o1.first - o2.first
        } else {
            o1.second - o2.second
        }
    }

    val room = PriorityQueue<Int>()
    room.offer(schedule[0].second)

    for (i in 1 until n) {
        if (room.peek() <= schedule[i].first) {
            room.poll()
        }

        room.offer(schedule[i].second)
    }

    bw.write("${room.size}")

    bw.close()
    br.close()
}
