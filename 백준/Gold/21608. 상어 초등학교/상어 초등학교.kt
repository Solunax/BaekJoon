import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var n = 0
lateinit var map: Array<Array<Int>>
lateinit var student: HashMap<Int, List<Int>>

fun main() {
    n = br.readLine().toInt()
    map = Array(n) { Array(n) { 0 } }
    student = HashMap()

    repeat(n * n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        student[input[0]] = input.subList(1, input.size)

        findSeat(input[0])
    }

    bw.write("${getScore()}")

    bw.close()
    br.close()
}

fun findSeat(s: Int) {
    val temp = ArrayList<Array<Int>>()

    for (y in 0 until n) {
        for (x in 0 until n) {
            var friend = 0
            var empty = 0

            repeat(4) {
                val nx = x + dx[it]
                val ny = y + dy[it]

                if (nx in 0 until n && ny in 0 until n) {
                    val nSeat = map[ny][nx]

                    if (nSeat in student[s]!!) {
                        friend++
                    }

                    if (nSeat == 0) {
                        empty++
                    }
                }
            }
            temp.add(arrayOf(friend, empty, x, y))
        }
    }

    temp.sortWith { o1, o2 ->
        if (o1[0] < o2[0]) {
            return@sortWith 1
        } else if (o1[0] == o2[0]) {
            if (o1[1] < o2[1]) {
                return@sortWith 1
            } else if (o1[1] == o2[1]) {
                if (o1[2] < o2[2]) {
                    return@sortWith 1
                } else if (o1[2] == o2[2]) {
                    if (o1[3] < o2[3]) {
                        return@sortWith 1
                    }
                }
            }
        }
        return@sortWith -1
    }

    for (seat in temp) {
        val x = seat[2]
        val y = seat[3]

        if (map[y][x] == 0) {
            map[y][x] = s
            return
        }
    }
}

fun getScore(): Int {
    var sum = 0

    for (y in 0 until n) {
        for (x in 0 until n) {
            val friend = student[map[y][x]]
            var count = 0
            
            repeat(4) {
                val nx = x + dx[it]
                val ny = y + dy[it]

                if (nx in 0 until n && ny in 0 until n) {
                    val now = map[ny][nx]

                    repeat(4) { v ->
                        if (now == friend!![v]) {
                            count++
                        }
                    }
                }
            }

            sum += when(count) {
                1 -> 1
                2 -> 10
                3 -> 100
                4 -> 1000
                else -> 0
            }
        }
    }

    return sum
}