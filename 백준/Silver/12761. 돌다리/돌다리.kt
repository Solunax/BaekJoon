import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val map = IntArray(100001)
val visit = BooleanArray(100001)
var a = 0
var b = 0
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    a = input[0]
    b = input[1]
    n = input[2]
    m = input[3]

    search()
    bw.write("${map[m]}")

    bw.close()
    br.close()
}

fun search() {
    val queue = LinkedList<Int>()
    visit[n] = true
    queue.add(n)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        val moveSet = listOf(
            now + 1, now - 1, now + a, now - a,
            now + b, now - b, now * a, now * b
        )

        for (i in moveSet) {
            if (i in 0..100000 && !visit[i]) {
                visit[i] = true
                map[i] = map[now] + 1
                queue.add(i)
            }
        }

        if (map[m] != 0) {
            return
        }
    }
}