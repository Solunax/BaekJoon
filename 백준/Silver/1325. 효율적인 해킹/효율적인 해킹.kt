import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.math.max

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var computer: Array<ArrayList<Int>>
lateinit var result: IntArray
lateinit var visit: Array<Boolean>

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    computer = Array(n + 1) { ArrayList() }
    result = IntArray(n + 1)

    repeat(m) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        computer[a].add(b)
    }

    for (i in 1..n) {
        visit = Array(n + 1) { false }
        search(i)
    }

    var maxValue = Int.MIN_VALUE

    for (i in result) {
        maxValue = max(maxValue, i)
    }

    for (i in 1..n) {
        if (result[i] == maxValue) {
            bw.write("$i ")
        }
    }

    bw.close()
    br.close()
}

fun search(index: Int) {
    val queue = LinkedList<Int>()
    visit[index] = true
    queue.add(index)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (v in computer[now]) {
            if (!visit[v]) {
                visit[v] = true
                result[v]++
                queue.add(v)
            }
        }
    }
}