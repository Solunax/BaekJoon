import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()
val result = HashSet<String>()
val map = Array(5) { List(5) { 0 } }
val str = ArrayList<Int>()
val dx = listOf(0, 0, 1, -1)
val dy = listOf(1, -1, 0, 0)

fun main() {
    repeat(5) {
        map[it] = br.readLine().split(" ").map { v -> v.toInt() }
    }

    for (y in 0 until 5) {
        for (x in 0 until 5) {
            str.add(map[y][x])
            getNumber(x, y, 1)
            str.removeLast()
        }
    }

    bw.write("${result.size}")

    bw.close()
    br.close()
}

fun getNumber(x: Int, y: Int, count: Int) {
    if (count == 6) {
        result.add(str.joinToString(""))
        return
    }

    repeat(4) {
        val nx = x + dx[it]
        val ny = y + dy[it]

        if (nx in 0 until 5 && ny in 0 until 5) {
            str.add(map[ny][nx])
            getNumber(nx, ny, count + 1)
            str.removeLast()
        }
    }
}