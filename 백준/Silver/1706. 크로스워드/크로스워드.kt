import java.io.BufferedReader
import java.io.InputStreamReader

val br = BufferedReader(InputStreamReader(System.`in`))
val bw = System.out.bufferedWriter()

fun main() {
    val (r, c) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(r) { CharArray(c) }
    val result = ArrayList<String>()

    repeat(r) {
        map[it] = br.readLine().toCharArray()
    }

    for (y in 0 until r) {
        val sb = StringBuilder()
        for (x in 0..c) {
            if (x == c || map[y][x] == '#') {
                if (sb.length >= 2) {
                    result.add(sb.toString())
                }
                sb.clear()
            } else {
                sb.append(map[y][x])
            }
        }
    }

    for (x in 0 until c) {
        val sb = StringBuilder()
        for (y in 0..r) {
            if (y == r || map[y][x] == '#') {
                if (sb.length >= 2) {
                    result.add(sb.toString())
                }
                sb.clear()
            } else {
                sb.append(map[y][x])
            }
        }
    }

    result.sort()
    bw.write(result.first())

    bw.close()
    br.close()
}