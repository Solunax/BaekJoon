import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { CharArray(m) }
    var leftTop: Pair<Int, Int>? = null
    var rightBottom: Pair<Int, Int>? = null

    repeat(n) {
        map[it] = br.readLine().toCharArray()
    }

    for (y in 0 until n) {
        if (leftTop != null) {
            break
        }

        for (x in 0 until m) {
            if (map[y][x] == '#') {
                leftTop = Pair(x, y)
                break
            }
        }
    }

    for (y in n - 1 downTo 0) {
        if (rightBottom != null) {
            break
        }

        for (x in m - 1 downTo 0) {
            if (map[y][x] == '#') {
                rightBottom = Pair(x, y)
                break
            }
        }
    }

    val centerX = (leftTop!!.first + rightBottom!!.first) / 2
    val centerY = (leftTop.second + rightBottom.second) / 2

    if (map[leftTop.second][centerX] == '.') {
        bw.write("UP")
    } else if (map[centerY][leftTop.first] == '.') {
        bw.write("LEFT")
    } else if (map[rightBottom.second][centerX] == '.') {
        bw.write("DOWN")
    } else if (map[centerY][rightBottom.first] == '.') {
        bw.write("RIGHT")
    }

    bw.close()
    br.close()
}