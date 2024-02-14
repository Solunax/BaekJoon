import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val dx = listOf(1, 0, -1, 0)
val dy = listOf(0, 1, 0, -1)

fun main() {
    val n = br.readLine().toInt()
    val findNum = br.readLine().toInt()
    val map = Array(n) { Array(n) { 0 } }
    var x = 0
    var y = 0
    var resultX = 0
    var resultY = 0
    var index = 0
    map[x][y] = n * n

    if (n * n == findNum) {
        resultX = 1
        resultY = 1
    }

    while (true) {
        val nx = x + dx[index]
        val ny = y + dy[index]

        if (nx in 0 until n && ny in 0 until n && map[nx][ny] == 0) {
            map[nx][ny] = map[x][y] - 1

            if (map[nx][ny] == findNum) {
                resultX = nx + 1
                resultY = ny + 1
            }

            if (map[nx][ny] == 1) {
                break
            }

            x = nx
            y = ny
        } else {
            index++
        }

        if (index > 3) {
            index = 0
        }
    }

    map.forEach { a ->
        a.forEach {
            bw.write("$it ")
        }
        bw.write("\n")
    }
    bw.write("$resultX $resultY")

    bw.close()
    br.close()
}