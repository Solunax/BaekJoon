import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var person: Array<ArrayList<Int>>
lateinit var color: Array<Int>
val t1 = ArrayList<Int>()
val t2 = ArrayList<Int>()

fun main() {
    val n = br.readLine().toInt()
    person = Array(n) { ArrayList() }
    color = Array(n) { 0 }

    for (i in 0 until n) {
        val hate = StringTokenizer(br.readLine())

        for (j in 0 until hate.nextToken().toInt()) {
            person[i].add(hate.nextToken().toInt() - 1)
        }
    }

    for (i in 0 until n) {
        if (color[i] == 0) {
            search(i, 1)
        }
    }

    var index = 1
    color.forEach {
        when (it) {
            1 -> t1.add(index)
            -1 -> t2.add(index)
        }
        index++
    }

    if (t2.isEmpty()) {
        t2.add(t1.removeLast())
    }

    bw.write("${t1.size}\n${t1.joinToString(" ")}\n")
    bw.write("${t2.size}\n${t2.joinToString(" ")}")

    bw.close()
    br.close()
}

fun search(start: Int, c: Int) {
    val queue = LinkedList<Int>()
    color[start] = c
    queue.add(start)

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        for (i in person[now]) {
            if (color[i] == 0) {
                queue.add(i)
                color[i] = color[now] * -1
            }
        }
    }
}