import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    var start = 10
    var end = 0
    val color = Array(4) { 0 }
    val number = Array(10) { 0 }

    repeat(5) {
        val (c, n) = br.readLine().split(" ")
        when (c) {
            "R" -> color[0]++
            "G" -> color[1]++
            "B" -> color[2]++
            "Y" -> color[3]++
        }
        number[n.toInt()]++
        start = min(start, n.toInt())
        end = max(end, n.toInt())
    }

    var straightCheck = true
    var count = 0
    for (i in start..end) {
        if (number[i] == 0) {
            straightCheck = false
            break
        }
        count++
    }

    if (count != 5) {
        straightCheck = false
    }

    val result = if (color.contains(5) && straightCheck) {
        end + 900
    } else if (number.contains(4)) {
        number.indexOf(4) + 800
    } else if (number.contains(3) && number.contains(2)) {
        number.indexOf(3) * 10 + number.indexOf(2) + 700
    } else if (color.contains(5)) {
        end + 600
    } else if (straightCheck) {
        end + 500
    } else if (number.contains(3)) {
        number.indexOf(3) + 400
    } else if (number.count { it == 2 } == 2) {
        var minValue = 10
        var maxValue = 0
        for (i in start..end) {
            if (number[i] == 2) {
                minValue = min(i, minValue)
                maxValue = max(i, maxValue)
            }
        }

        maxValue * 10 + minValue + 300
    } else if (number.contains(2)) {
        number.indexOf(2) + 200
    } else {
        end + 100
    }

    bw.write("$result")

    bw.close()
    br.close()
}