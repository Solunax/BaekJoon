import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
var n = 0
var m = 0
var p = 0
lateinit var channel: Array<ArrayList<Int>>
lateinit var visit: BooleanArray

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    p = input[2]

    channel = Array(100001) { ArrayList() }
    visit = BooleanArray(100001)

    repeat(n) {
        val (like, hate) = br.readLine().split(" ").map { it.toInt() }
        channel[hate].add(like)
    }

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search(): Int {
    val queue = LinkedList<Int>()
    queue.add(p)
    visit[p] = true
    var result = 0

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        if (channel[now].size == 0) {
            return result
        }

        if (visit[channel[now][0]]) {
            break
        }

        queue.add(channel[now][0])
        visit[channel[now][0]] = true
        result++
    }

    return -1
}