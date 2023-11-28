import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Array<Int>>
var n = 0
var m = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    n = input[0]
    m = input[1]
    map = Array(n) { Array(n) { 0 } }

    repeat(m) { _ ->
        val (v1, v2) = br.readLine().split(" ").map { it.toInt() - 1 }
        map[v1][v2] = 1
        map[v2][v1] = 1
    }

    bw.write("${search()}")

    bw.close()
    br.close()
}

fun search() : Int{
    val visit = Array(n){false}
    var count = 0
    for (i in 0 until n) {
        if (visit[i]) {
            continue
        }

        val queue = LinkedList<Int>()
        queue.add(i)
        visit[i] = true

        while (queue.isNotEmpty()) {
            val now = queue.poll()

            for (j in 0 until n) {
                if (map[now][j] == 1 && !visit[j]) {
                    visit[j] = true
                    queue.add(j)
                }
            }
        }

        count++
    }

    return count
}