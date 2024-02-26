import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(0, 1, 0, -1)
val dy = listOf(-1, 0, 1, 0)

fun main() {
    br.readLine()
    val map = Array(101){Array(101){'#'} }
    var dir = 2
    var nowX = 50
    var nowY = 50
    var minX = 50
    var minY = 50
    var maxX = 50
    var maxY = 50

    map[nowY][nowX] = '.'
    br.readLine().forEach {
        when(it) {
            'F' -> {
                nowX += dx[dir]
                nowY += dy[dir]
                map[nowY][nowX] = '.'
                minX = min(minX, nowX)
                minY = min(minY, nowY)
                maxX = max(maxX, nowX)
                maxY = max(maxY, nowY)
            }
            'L' -> {
                if (dir == 0) {
                    dir = 3
                } else {
                    dir--
                }
            }
            'R' -> {
                if (dir == 3) {
                    dir = 0
                } else {
                    dir++
                }
            }
        }
    }

    for (y in minY .. maxY) {
        for (x in minX .. maxX) {
            bw.write("${map[y][x]}")
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}