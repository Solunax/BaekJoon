import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max
import kotlin.math.min

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
lateinit var map: Array<Array<String>>
lateinit var afterMap: Array<Array<String>>
var r = 0
var c = 0
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)
var sx = 100
var ex = 0
var sy = 100
var ey = 0

fun main() {
    val input = br.readLine().split(" ").map { it.toInt() }
    r = input[0]
    c = input[1]
    map = Array(r) { Array(c) { " " } }
    afterMap = Array(r) { Array(c) { "." } }

    repeat(r) { i ->
        val land = br.readLine().split("").filter { it.isNotEmpty() }
        for (j in 0 until c) {
            map[i][j] = land[j]
        }
    }

    for (y in 0 until r) {
        for (x in 0 until c) {
            if (map[y][x] == "X") {
                var count = 0

                repeat(4) {
                    val nx = x + dx[it]
                    val ny = y + dy[it]


                    if (nx in 0 until c && ny in 0 until r) {
                        if (map[ny][nx] == ".") {
                            count++
                        }
                    } else {
                        count++
                    }

                }

                if (count < 3) {
                    afterMap[y][x] = "X"
                }
            }
        }
    }

    minLocationCheck()

    for (y in sy..ey) {
        for (x in sx..ex) {
            bw.write(afterMap[y][x])
        }
        bw.write("\n")
    }

    bw.close()
    br.close()
}

fun minLocationCheck() {
    for (y in 0 until r) {
        for (x in 0 until c) {
            if (afterMap[y][x] == "X") {
                sx = min(sx, x)
                sy = min(sy, y)
                ex = max(ex, x)
                ey = max(ey, y)
            }
        }
    }
}