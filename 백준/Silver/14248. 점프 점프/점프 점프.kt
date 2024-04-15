import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: IntArray
lateinit var visit: BooleanArray
var n = 0
var start = 0
var result = 1
val dir = listOf(1, -1)

fun main() {
    n = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    map = IntArray(n + 1)
    visit = BooleanArray(n + 1)
    start = br.readLine().toInt()

    repeat(n){
        map[it + 1] = input.nextToken().toInt()
    }

    search()
    bw.write("$result")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Int>()
    queue.add(start)
    visit[start] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()
        val distance = map[now]

        repeat(2) {
            val next = distance * dir[it] + now

            if (next in 1..n && !visit[next]) {
                visit[next] = true
                queue.add(next)
                result++
            }
        }
    }
}