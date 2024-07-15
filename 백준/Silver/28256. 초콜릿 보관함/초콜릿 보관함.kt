import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.StringTokenizer

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<CharArray>
lateinit var visit: Array<BooleanArray>
lateinit var countingValue: ArrayList<Int>
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    repeat(br.readLine().toInt()) {
        map = Array(3) { CharArray(3) }
        visit = Array(3) { BooleanArray(3) }
        countingValue = ArrayList()

        repeat(3) {
            map[it] = br.readLine().toCharArray()
        }

        for (y in 0 until 3) {
            for (x in 0 until 3) {
                if (map[y][x] == 'O' && !visit[y][x]) {
                    search(x, y)
                }
            }
        }

        val st = StringTokenizer(br.readLine())
        val checkSize = st.nextToken().toInt()
        countingValue.sort()
        var result = true

        if (countingValue.size != checkSize) {
            result = false
        } else {
            for (i in 0 until checkSize) {
                if (countingValue[i] != st.nextToken().toInt()) {
                    result = false
                    break
                }
            }
        }

        if (result) {
            bw.write("1\n")
        } else {
            bw.write("0\n")
        }
    }

    bw.close()
    br.close()
}

fun search(x: Int, y: Int) {
    val queue = LinkedList<Pair<Int, Int>>()
    var count = 1
    queue.add(Pair(x, y))
    visit[y][x] = true

    while (queue.isNotEmpty()) {
        val now = queue.poll()

        repeat(4) {
            val nx = now.first + dx[it]
            val ny = now.second + dy[it]

            if (nx in 0 until 3 && ny in 0 until 3
                && map[ny][nx] == 'O' && !visit[ny][nx]) {
                queue.add(Pair(nx, ny))
                visit[ny][nx] = true
                count++
            }
        }
    }

    countingValue.add(count)
}