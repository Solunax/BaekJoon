import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val flower = ArrayList<Flower>()

    repeat(n) {
        val input = br.readLine().split(" ").map { it.toInt() }
        val start = input[0] * 100 + input[1]
        val end = input[2] * 100 + input[3]

        flower.add(Flower(start, end))
    }

    flower.sortWith { o1, o2 ->
        if (o1.startDate == o2.startDate) {
            o2.endDate - o1.endDate
        } else {
            o1.startDate - o2.startDate
        }
    }

    var start = 301
    val end = 1201
    var count = 0
    var now = 0
    var flowerIndex = 0

    while (start < end) {
        var flowerCheck = false

        for (i in flowerIndex until n) {
            if (flower[i].startDate > start) {
                break
            }

            if (now < flower[i].endDate) {
                flowerCheck = true
                now = flower[i].endDate
                flowerIndex = i + 1
            }
        }

        if (flowerCheck) {
            start = now
            count++
        } else {
            break
        }
    }

    if (now < end) {
        bw.write("0")
    } else {
        bw.write("$count")
    }

    bw.close()
    br.close()
}

data class Flower(val startDate: Int, val endDate: Int)