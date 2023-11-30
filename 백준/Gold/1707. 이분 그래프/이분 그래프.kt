import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<ArrayList<Int>>
lateinit var color : Array<Int>
var v = 0
var e = 0

fun main() {
    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ").map { it.toInt() }
        v = input[0]
        e = input[1]
        map = Array(v) { ArrayList() }
        color = Array(v){0}

        repeat(e) { _ ->
            val (v1, v2) = br.readLine().split(" ").map { it.toInt() - 1 }
            map[v1].add(v2)
            map[v2].add(v1)
        }

        var check = true
        for (i in 0 until v) {
            if (color[i] == 0) {
                check = search(i, 1)
            }

            if (!check) {
                break
            }
        }

        if (check) {
            bw.write("YES\n")
        } else {
            bw.write("NO\n")
        }
    }

    bw.close()
    br.close()
}

fun search(start : Int, c : Int): Boolean {
    val queue = LinkedList<Int>()
    queue.add(start)
    color[start] = c

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in map[now]) {
            if (color[i] == 0) {
                queue.add(i)
                color[i] = color[now] * -1
            } else if (color[now] == color[i]) {
                return false
            }
        }
    }

    return true
}