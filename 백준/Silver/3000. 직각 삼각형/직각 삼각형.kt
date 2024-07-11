import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val n = br.readLine().toInt()
    val point = Array(n) { IntArray(2) }

    repeat(n) {
        point[it] = br.readLine().split(" ").map { v -> v.toInt() }.toIntArray()
    }

    val resultX = HashMap<Int, Int>()
    val resultY = HashMap<Int, Int>()

    repeat(n) { i ->
        val countX = resultX[point[i][0]]
        val countY = resultY[point[i][1]]

        if (countX == null) {
            resultX[point[i][0]] = 1
        } else {
            resultX[point[i][0]] = countX + 1
        }

        if (countY == null) {
            resultY[point[i][1]] = 1
        } else {
            resultY[point[i][1]] = countY + 1
        }
    }

    var result = 0L
    repeat(n) { i ->
        val x = resultX[point[i][0]]!! - 1L
        val y = resultY[point[i][1]]!! - 1L

        result += x * y
    }

    bw.write("$result")

    bw.close()
    br.close()
}